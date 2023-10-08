package College;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CoursesDetails")
public class CoursesDetails extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Couses</title></head><body style =  'background-color:Orange; text-align:center'><h1>--- COURSES ---</h1><br><br>"
				+ "<br> <h2> MCA (Master in Computer Applications)</h2> <br>  "
				+ " BBA (Bachelor in Business Adminstration)<br> MBA (Master in Business Adminstration)<br> BA (Bachelor of Arts) <br> MA (Master of Arts) </h2></body></html>");
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	}

}
