package College;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

				PrintWriter out = response.getWriter();
			try {	
				String password = request.getParameter("p1");
				String email = request.getParameter("e1");
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
				PreparedStatement st = con.prepareStatement("select * from Akki where Email = ?");
				st.setString(1, email);

				ResultSet rs = st.executeQuery();
				
				String dbpass = null;
				if(rs.next()) {
					dbpass = rs.getString(2);
				}
				
				if(password.equals(dbpass)) {
					RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
					rq.include(request, response);
					out.println("<html><body><marquee scrollamount = '10'; loop = '1'; style = 'color:green; font-weight:bold; font-size:20px; ' >--- Logged In Successfully ---</marquee></body></html>");
				} else {
					RequestDispatcher rq = request.getRequestDispatcher("login.jsp");
					rq.include(request, response);
					out.println("<h3 style = color:red>WRONG USERNAME OR PASSWORD</h3>");
				}
				
			} catch (Exception e){
				System.out.println("Error || "+e);
	     		}

     	}
   }


	



