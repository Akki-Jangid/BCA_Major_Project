package Courses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BBA")
public class BBA extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Couses</title></head><body background = \"D:\\Downloded Files (FDM)\\back_1.jpg\" style =  'background-size:1200px; text-align:center; font-size:20px'><h2>BBA (Bachelor in Business Administration)</h2>"
				+"Bachelor of Business Administration or BBA is one of the most popular and sought after bachelor degree programmes pursued by students after Class 12. The BBA course is the gateway to a plethora of job opportunities in numerous sectors such as Marketing, Education, Finance, Sales, and Government to name a few. \r\n"
				+ "\r\n"
				+ "BBA is a three-year professional undergraduate course in Business Management. It is open to students from all the three streams: Science, Arts and Commerce. The BBA course offers knowledge and training in management and leadership skills to prepare them for managerial roles and entrepreneurship. There are about 4600 BBA colleges in India. Students who wish to land in the field of management can pursue the BBA course after completing Class 12. The course will help the students learn various aspects of business administration and management through classroom lectures and practical projects like internships. The course will acquaint the students with various aspects of the business administration, market, marketing trends, etc.\r\n"
				+ "\r\n"
				+ "The BBA programme is available for students in full-time, correspondence or online mode of education."
				+"<br><h4>BBA Eligibility Criteria and Entrance Exams</h4>"
				+ "Aspirants who have completed their Class 12 in any stream from a recognised educational board or university can pursue BBA\r\n"
				+ "The candidates must have attained a minimum of 50% aggregate and above in Class 12\r\n"
				+ "In case a candidate has appeared for Class 12 exam and is waiting for the result, s/he can also apply to the course. "
				+"<br><h4>BBA Syllabus and Subjects</h4>"
				+ "BBA syllabus is divided into six semesters. The BBA syllabus broadly consists of subjects such as Business Organisation, Business Communication, Fundamentals of Accounting, Business Mathematics, Management Concepts and Practices, Organisational Behavior, Managerial Economics, Management Accounting, Business Environment, Business Statics, Marketing Management, etc. Given below is the list of a few subjects and topics under the BBA Syllabus: "
				);
	
		out.println("<h3><a  style = 'color:green' href = courses.jsp>BACK</a></h3> <h3><a  style = 'color:red;' href = index.jsp>HOME</a></h3>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
