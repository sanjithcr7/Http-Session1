package http;

import jakarta.servlet.http.HttpServlet;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class GetSession
 */
@WebServlet("/get")
public class GetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			HttpSession hs=request.getSession();
			String s1=(String)hs.getAttribute("p1");
			String s2=(String)hs.getAttribute("p2");
			String s3=(String)hs.getAttribute("p3");
			PrintWriter pw=response.getWriter();
			pw.println("<html><body>");
			pw.println("<h1>Your Cart</h1>");
			if(s1!=null) {
				pw.println(s1+"<br>");
			}
			if(s2!=null) {
				pw.println(s2+"<br>");
			}
			if(s3!=null) {
				pw.println(s3+"<br>");
			}
			
			pw.println("</body></html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
