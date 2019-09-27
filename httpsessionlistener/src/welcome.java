

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
public class welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	   HttpSession session=request.getSession();
	   session.setMaxInactiveInterval(20);
	   if(session==null)
	   {
		   response.sendRedirect("redirect.html");
	   }
	   else
	   {
	   String sid=session.getId();
	   String usernm=request.getParameter("user");
	   System.out.println("Session id is"+sid);
	   session.setAttribute("user", usernm)	;
	   String encode=response.encodeURL("javabook");
	   System.out.println("Encoded url is  "+encode);
	   PrintWriter out=response.getWriter();
	   out.println("<body bgcolor=cyan text=red><h3>Welcome "+usernm+" to online shopee" +
				"<p>Select from following books</p>" +
				"<p><a href="+encode+">Java</a></p>"
				+"<p>c++</p>");
	   }
	  
	   
	}

}
