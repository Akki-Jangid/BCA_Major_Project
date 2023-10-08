package Courses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MBA")
public class MBA extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Couses</title></head><body background = \"D:\\Downloded Files (FDM)\\back_1.jpg\" style =  'background-size:1200px; text-align:center; font-size:20px'><h2>MBA (Master in Business Administration)</h2>"
				+"Master of Business Administration or MBA is one of the most popular post-graduate programmes in India and abroad. The two-year management programme is a gateway to a plethora of job opportunities in the corporate world. In India, MBA course has gained a lot of significance over the last two decades. For most of the managerial level jobs across domains and sectors an MBA degree has become a necessity which is why, nowadays a large number of BTech, BBA, BCom, BA, BSc, BCA graduates opt for MBA in their post graduation. Here are some important facts about the MBA program:"
				+"<h4>MBA Eligibility Criteria</h4>\r\n"
				+ "Full-time MBA eligibility criteria are as follows: \r\n"
				+ "\r\n"
				+ "The basic eligibility criteria for MBA (full-time) is Graduation in any discipline or equivalent from a recognised university\r\n"
				+ "\r\n"
				+ "Most of the institutes follow the minimum score criteria in Graduation which is 50 per cent in average or equivalent. For Reserved category students, the minimum score in 45 per cent in aggregate\r\n"
				+ "\r\n"
				+ "Final-year Graduation candidates are also eligible to apply for MBA, provided they present the proof of completion of Graduation degree within the duration specified by the institute\r\n"
				+ "\r\n"
				+ "Professionals with CA/CS/ICWAI and other degrees can also pursue MBA"
				);
		
		out.println("<h3><a  style = 'color:green' href = courses.jsp>BACK</a></h3> <h3><a  style = 'color:red;' href = index.jsp>HOME</a></h3>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
