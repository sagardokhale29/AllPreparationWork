

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginsevlet
 */
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user1=request.getParameter("user");
		String passwd=request.getParameter("passwd");
		if(user1!=null&&passwd!=null&&user1.equals("sagar")&&passwd.equals("123"))
		{
			ServletContext ctx=getServletContext();
			RequestDispatcher rd=ctx.getRequestDispatcher("/welcome");
			rd.forward(request, response);
		}
		else
		{
			PrintWriter out=response.getWriter();
			out.println("<p>Invalid login</p>");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		
	}

}
