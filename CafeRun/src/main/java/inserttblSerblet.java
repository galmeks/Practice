

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class seltblSerblet
 */
@WebServlet("/inserttbl")
public class inserttblSerblet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inserttblSerblet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		incomeDAO dao = new incomeDAO();
		String outstr="";
		incomeDTO idto= new incomeDTO();
		idto.setPrice(Integer.parseInt(request.getParameter("price")));
		idto.setMobile(request.getParameter("mobile"));
		idto.setQty(Integer.parseInt(request.getParameter("qty")));
		idto.setSeqno(request.getParameter("name"));
		idto.setIncome_date(request.getParameter("date"));
		idto.setSeqno(request.getParameter("seqno"));
		dao.insert(idto);
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
