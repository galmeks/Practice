

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listRoomServlet
 */
@WebServlet("/listRoom")
public class listRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listRoomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		RoomDAO dao = new RoomDAO();
		String outstr = "";
		ArrayList<RoomDTO> list = dao.listRoom();
		for(int i=0;i<list.size();i++) {
			RoomDTO data = new RoomDTO();
			data = list.get(i);
			outstr+="<option value='"+data.getSeq()+"'>"+data.getName()+
					" "+data.getSort()+" "+data.getPeople()+"Έν "+data.getPrice()+"</option>";
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
