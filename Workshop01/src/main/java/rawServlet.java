

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class rawServlet
 */
@WebServlet("/rawServlet")
public class rawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rawServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");

		response.getWriter().print("<input type=text value='"+name+"'id=name><br><input type=text value='"+mobile+"'id=mobile><br>");
		response.getWriter().print("<input type=button value='실행' id=btnGo><input type=button value='취소' id=btnCancel><br>");
		response.getWriter().print("내 이름 : "+name+"<br>");
		response.getWriter().print("모바일 : "+mobile+"<br>");
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
