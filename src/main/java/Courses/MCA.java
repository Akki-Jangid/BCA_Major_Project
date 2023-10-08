package Courses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MCA")
public class MCA extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Couses</title></head><body background = \"D:\\Downloded Files (FDM)\\back_1.jpg\" style =  'background-size:1200px; text-align:center; font-size:20px'><h2>MCA (Master in Computer Applications)</h2> <br> "
				+"Master of Computer Applications (MCA) is a two year professional post-graduate programme for candidates wanting to delve deeper into the world of computer application development with the help of learning modern programming language. The programme is a blend of both theoretical and practical knowledge. An MCA degree endows students’ an opportunity  to work with tools meant to develop better and faster applications.\r\n"
				+ "\r\n"
				+ "Designed to meet the shortage of qualified professionals in the IT (Information Technology) industry, an MCA degree - in India - is offered by many colleges. Infact, there are various colleges that also offer integrated MCA programmes as well. "
				+"<br><br><h4>Eligibility Criteria for MCA</h4> \r\n"
				+ "According to AICTE, to pursue an MCA course candidates must have pursued BCA/ BSc/ BCom/ BA degree with Mathematics as one of the subjects at 10+2 level or at graduation.\r\n"
				+ "\r\n"
				+ "However, MCA colleges in India might ask you to fulfill the following as well:\r\n"
				+ "\r\n"
				+ "Minimum marks required: 50% to 60% (a CGPA above 6/10 is considered good) in Bachelor's; 55% and above in Class 12th. Class 10th marks do not matter in most cases.");
	
		out.println("<h3><a  style = 'color:green' href = courses.jsp>BACK</a></h3> <h3><a  style = 'color:red;' href = index.jsp>HOME</a></h3>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
