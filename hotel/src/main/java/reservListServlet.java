

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class reservListServlet
 */
@WebServlet("/reservList")
public class reservListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reservListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		reservDAO dao = new reservDAO();
		String outstr = "";
		String checkout= request.getParameter("checkout");
		String checkin= request.getParameter("checkin");
		int people=Integer.parseInt(request.getParameter("people"));
		int typeNum=Integer.parseInt(request.getParameter("type"));
		ArrayList<reservDTO> list = dao.reservList(checkout,checkin,people,typeNum);
		for(int i=0;i<list.size();i++) {
			reservDTO data = new reservDTO();
			data = list.get(i);
			String check_in[] = data.getCheckin().split(" ");
			String check_out[] = data.getCheckout().split(" ");
			outstr+="<option value='"+data.getReservNum()+"'>"+data.getR_name()+
					" "+check_in[0]+"~"+check_out[0]+" ["+data.getPeople()+"??] "+data.getName()+"</option>";
		}
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
