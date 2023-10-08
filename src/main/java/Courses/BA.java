package Courses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BA")
public class BA extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Couses</title></head><body background = \"D:\\Downloded Files (FDM)\\back_1.jpg\" style =  ' background-size:1200px; text-align:center; font-size:20px'><h2>BA (Bachelor of Arts)</h2>"
				+"Bachelor of Arts or BA is one of the most popular undergraduate programmes that students pursue right after passing class 12th in India. Usually, a three-year course Arts programme is offered by colleges under various streams such as Design, Mass Communication, Hospitality, and Humanities."
				+"<h4>BA Quick Facts:</h4>\r\n"
				+ "\r\n"
				+ "Candidates can pursue BA (Hons) or BA Programme course in a full-time, part-time, correspondence or distance education mode\r\n"
				+ "\r\n"
				+ "It is mandatory to study five subjects along with few elective subjects. The subjects will vary depending on the selected subject\r\n"
				+ "\r\n"
				+ "BA is most popular among Humanities students\r\n"
				+ "\r\n"
				+ "<h4>BA Eligibility Criteria</h4>\r\n"
				+ "The eligibility criteria for a BA course specify that:\r\n"
				+ "\r\n"
				+ "Candidates should have completed their 10+2 from a recognised board.\r\n"
				+ "\r\n"
				+ "Apart from this, some colleges also specify that aspirants should have secured a minimum of 50% aggregate marks at their Class 12 level in order to be eligible to pursue a BA course offered by them.\r\n"
				+ "\r\n"
				+ "Some colleges also offer 5% marks relaxation in this criteria for SC/ ST candidates."
				);
	
		out.println("<h3><a  style = 'color:green' href = courses.jsp>BACK</a></h3> <h3><a  style = 'color:red;' href = index.jsp>HOME</a></h3>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
