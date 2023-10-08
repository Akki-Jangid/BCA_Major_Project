package College;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Query")
public class Query extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
		rq.include(request, response);
		out.println("<html><body><marquee scrollamount = '10'; loop = '1'; style = 'color:green; font-weight:bold; font-size:20px; ' >--- Your Query Has Been Submitted Successfully ---</marquee></body></html>");
		
	}

}
