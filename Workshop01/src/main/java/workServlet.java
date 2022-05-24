

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class workServlet
 */
@WebServlet("/workServlet")
public class workServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public workServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String op =request.getParameter("op");
		String val1 =request.getParameter("val1");
		String val2 =request.getParameter("val2");
		if(op == null || val1==null || val2==null) {
			return;
		}
		int num1=Integer.parseInt(val1);
		int num2=Integer.parseInt(val2);
		if(op.equals("plus")) {
			response.getWriter().append(val1+"+"+val2+"="+(num1+num2));
		}else if(op.equals("minus")) {
			response.getWriter().append(val1+"-"+val2+"="+(num1-num2));
		}else if(op.equals("multi")) {
			response.getWriter().append(val1+"x"+val2+"="+(num1*num2));
		}else if(op.equals("div")) {
			response.getWriter().append(val1+"/"+val2+"="+(num1/num2));
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
