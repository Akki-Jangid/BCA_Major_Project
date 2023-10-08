package Courses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BCA")
public class BCA extends HttpServlet {
	
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Couses</title></head><body background = \"D:\\Downloded Files (FDM)\\back_1.jpg\" style =  'background-size:1200px; text-align:center; font-size:20px'><h2>BCA (Bachelor in Computer Applications)</h2> <br> Bachelor in Computer Application (BCA) is an undergraduate degree course in computer applications. With the rapid growth of IT industry in India, the demand of computer professional is increasing day by day. This increasing growth of IT industry has created a lot of opportunities for the computer graduates.\r\n"
				+ "\r\n"
				+ "Bachelor in Computer Application (BCA) is one of the popular courses among the students who want to make their career in the IT (Information Technology) field. The duration of the course is 3 years and divided into 6 semesters. It comprises of the subjects like database, networking, data structure, core programming languages like ‘C’ and ‘java’. This course provides a lot of opportunities to the students who are interested in computer field and wants to work in the IT sector as programmer or software developer.  "
				+ "<br><h3>Eligibility</h3>\r\n"
				+ "Before planning for any examination it is very important to check out some basic but important points. One of the most important point before applying any course is the eligibility. It needs to be checked whether the candidate is eligible for appearing for desired course or not. The students who are interested in BCA as their higher studies must fulfill the following eligibility criteria:\r\n"
				+ "\r\n"
				+ "Candidate Should be a citizen of India.\r\n"
				+ "Candidate must have passed class 12th or senior secondary examination with at least 50% marks including English.\r\n"
				+ "The 12th examination must be passed/Appearing with mathematics as a compulsory subject.\r\n"
				+ "The minimum age limit is 17 years and the maximum age varies between 22-25 years.\r\n"
				+ "The students are generally admitted on the basis of personal interview and written examination conducted by various institutes/universities.\r\n"
				+ "Some institutes/universities admit student on merit basis.\r\n"
				+ "The merit is prepared on the basis of candidate’s performance in the qualifying examination (12th).");
		
		out.println("<h3><a  style = 'color:green' href = courses.jsp>BACK</a></h3> <h3><a  style = 'color:red;' href = index.jsp>HOME</a></h3>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


}
}
