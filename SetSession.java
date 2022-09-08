package http;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class SetSession
 */
@WebServlet("/set")
public class SetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SetSession() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("mobile1");
		String s2=request.getParameter("mobile2");
		String s3=request.getParameter("mobile3");
		HttpSession hs=request.getSession();
		hs.setAttribute("p1", s1);
		hs.setAttribute("p2", s2);
	    hs.setAttribute("p3", s3);
	    PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("<a href=get>Next</a>");
	}

}
