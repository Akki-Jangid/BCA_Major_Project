package College;

import java.io.*;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		doGet(request, response);
		try {	
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			PreparedStatement st = con.prepareStatement("insert into Akki (Name, Pass, Mobile, Email) values (?,?,?,?)");
			st.setString(1, request.getParameter("t1"));
			st.setString(2, request.getParameter("p1"));
			st.setInt(3, Integer.valueOf(request.getParameter("n1")));
			st.setString(4, request.getParameter("e1"));
			int val = st.executeUpdate();
			if (val != 0 ) {
			
				out.println("<html><body background = \"D:\\Downloded Files (FDM)\\back_1.jpg\"; style = background-size:1000px; text-align:center'><br><h1 style = text-align:center;>--- Registered Successfully ---</h1><br><br>");
				out.println("<a style = text-align:center; href = login.jsp><h2>Login Page</h2></a>");
			} else {
				out.println("<h1>Something Went Wrong TryAgain!</h1>");
				response.sendRedirect("Register.jsp");
			}
			
			st.close();
			con.close();
		} catch (Exception e){
			System.out.println("Error || "+e);
		}
	}

}
