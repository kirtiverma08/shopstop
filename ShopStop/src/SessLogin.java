

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessLogin
 */
@WebServlet("/SessLogin")
public class SessLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
try {
	response.setContentType("text/html");
	PrintWriter p= response.getWriter();
	String name=request.getParameter("uname");
	String password=request.getParameter("upass");
	p.print("hello"+name);
	p.print("Your password is:"+password);
	HttpSession session= request.getSession();
	p.print("Session Id:"+session.getId());
	p.print("Session Id :"+session.getCreationTime());
	session.setAttribute("uname", "name");
	session.setAttribute("upass", ""
			+ ""
			+ ""
			+ ""
			+ ""
			+ "password");
	p.print("< a href='SessWelcome'> view details</a>");
			p.close();
}
catch(Exception e)
{
	System.out.println(e);
}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
