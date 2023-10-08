package College;
import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Admission")
public class Admission extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		PrintWriter out = response.getWriter();		
		String name = request.getParameter("fname");
		String course = request.getParameter("cour");
		String education = request.getParameter("edu");
		String address = request.getParameter("add");
		String mobile = request.getParameter("mob");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
		PreparedStatement ps = con.prepareStatement("Insert into Form (Name, Course, Education, Address, Mobile) values (?,?,?,?,?) ");
		ps.setString(1, name);
		ps.setString(2, course);
		ps.setString(3, education);
		ps.setString(4, address);
		ps.setString(5, mobile);
		int val = ps.executeUpdate();

		if(val != 0) {
			
			RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
			rq.include(request, response);
			out.println("<body> <marquee direction = 'left'; scrollamount = '10';><h3 style = 'color:green'>--- Your Form Has Been Submitted Successfully ---</marquee></body>");
			
		} else {
			out.println("<body><h2 style = 'color:red'> Not Submitted .. Fill This Form Completely And Carefully!</h2></body>");
			
		}
		} catch (Exception e) {
			System.out.println("Error || "+e);
		}
		
	}

}
