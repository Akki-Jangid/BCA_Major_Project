package Courses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MA")
public class MA extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Couses</title></head><body background = \"D:\\Downloded Files (FDM)\\back_1.jpg\" style =  'background-size:1200px; text-align:center; font-size:20px'><h2>MA (Master of Arts)</h2>"
				+"MA or Master of Arts is a postgraduate degree available to individuals who have earned their bachelor's degree (also known as, undergraduate degree). The degree is offered in various specialisations at various colleges and universities in India and abroad. The graduate-level of study is mostly focused on the humanities and social sciences field.\r\n"
				+ "\r\n"
				+ "<h4>MA Quick Facts:</h4>\r\n"
				+ "\r\n"
				+ "The duration of an MA course is usually two years \r\n"
				+ "Candidates who possess a graduation degree can only pursue an MA course\r\n"
				+ "The degree can be pursued as a full-time course, part-time course, correspondence or distance mode\r\n"
				+ "<h4>MA Eligibility Criteria</h4>\r\n"
				+ "MA is a specialised course in which aspirants are offered in-depth knowledge of the discipline they have selected. The eligibility parameters for a MA programme states that:\r\n"
				+ "\r\n"
				+ "Bachelor degree (preferably arts) holders of a minimum 3 or 4-year duration with its equivalent (10+2+3 or 10+2+4). The degree should be from a university that is recognized by the UGC (University Grants Commission) of India.\r\n"
				+ "A minimum of 55% aggregate at graduation level\r\n"
				+ "Candidates pursuing a three-year degree programme must clear all topics from 1st to 4th semester, while applicants pursuing a four-year degree programme must pass all topics from the first to the sixth semester."
				);
		out.println("<h3><a  style = 'color:green' href = courses.jsp>BACK</a></h3> <h3><a  style = 'color:red;' href = index.jsp>HOME</a></h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
