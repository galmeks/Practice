

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
//		String[] subject = request.getParameterValues("subject");
		// TODO Auto-generated method stub
		response.getWriter().print("13�� �濡 �������."+user_id+"��");
		response.getWriter().print("<br>Get��й�ȣ:"+user_pw);
//		response.getWriter().print("<br>���ɺо�:");
//		for(String str:subject) {
//			response.getWriter().print(str+", ");
//		}
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setContentType("text/html;charset=utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		// TODO Auto-generated method stub
		response.getWriter().print("Post���̵�:"+user_id);
		response.getWriter().print("<br>Post��й�ȣ:"+user_pw);
	}

}
