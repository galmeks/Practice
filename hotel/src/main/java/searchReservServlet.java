

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchReservServlet
 */
@WebServlet("/searchReserv")
public class searchReservServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchReservServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		int reservNum=Integer.parseInt(request.getParameter("reservNum"));
		String outstr="";
		reservDAO RDAO = new reservDAO();
		ArrayList<reservDTO> list = RDAO.selReserv(reservNum);
		reservDTO data=list.get(0);
		outstr+=data.getName()+" "+data.getMobile()+" "+data.getPeople()+" "+data.getTypeName()+" "+data.getPrice()+" "+data.getRoomNum();
		response.getWriter().print(outstr);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
