import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("Using ServletContext object to set and read context attributes");

		
		ServletContext servCon= getServletContext();
		//Setting Request Attributes to be shared between multiple servlets
		servCon.setAttribute("Name", request.getParameter("username"));
		servCon.setAttribute("Percent", request.getParameter("percentile"));

		if(new Integer((String) servCon.getAttribute("Percent")) <90)
		{
		RequestDispatcher reqDispatch = servCon.getRequestDispatcher("/MyServlet2");
		reqDispatch.forward(request,response);
		}
		else
		{
		RequestDispatcher reqDispatch = servCon.getRequestDispatcher("/MyServlet3");
		reqDispatch.forward(request,response);
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
