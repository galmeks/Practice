

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class M_modifyServlet
 */
@WebServlet("/modify")
public class M_modifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public M_modifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String price = request.getParameter("price");
		String name = request.getParameter("name");
		String sq_num = request.getParameter("sq_num");
		
		menuDTO mdto = new menuDTO();
		mdto.setName(name);
		mdto.setPrice(Integer.parseInt(price));
		mdto.setSq_num(Integer.parseInt(sq_num));
		menuDAO dao = new menuDAO();
		dao.modify(mdto);
		dao.modify2(mdto);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
