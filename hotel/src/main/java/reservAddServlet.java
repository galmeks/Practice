

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class reservAddServlet
 */
@WebServlet("/reservAdd")
public class reservAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reservAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String checkin = request.getParameter("checkin");
		String checkout = request.getParameter("checkout");
		int people = Integer.parseInt(request.getParameter("people"));
		int price = Integer.parseInt(request.getParameter("price"));
		int r_num = Integer.parseInt(request.getParameter("r_num"));
		reservDAO RDAO = new reservDAO();
		RDAO.addReserve(name,mobile,checkin,checkout,people,price,r_num);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
