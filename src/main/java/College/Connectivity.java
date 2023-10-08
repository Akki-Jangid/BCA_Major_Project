package College;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Connectivity")
public class Connectivity extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			PrintWriter out = response.getWriter();
			String a = request.getParameter("fname");
			String b = request.getParameter("lname");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			PreparedStatement st = con.prepareStatement("insert into aakash values (?,?)");
			st.setString(1, "a");
			st.setString(2, "b");
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error  || "+e);
		}
	}

}
