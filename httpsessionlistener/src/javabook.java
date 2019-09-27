

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class javabook
 */
public class javabook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(false);
		if(session==null)
		   {
			   response.sendRedirect("redirect.html");
		   }
		else
		{
		String username=(String) session.getAttribute("user");
		String sid=session.getId();
		System.out.println("sid is  "+sid);
		PrintWriter out=response.getWriter();
		out.println("<p>Dear "+username+" welcome to  java book page");
		}
		
	}

}