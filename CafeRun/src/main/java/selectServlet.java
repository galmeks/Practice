

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class selectServlet
 */
@WebServlet("/seltbl")
public class selectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		JSONArray ja = new JSONArray();
		incomeDAO dao = new incomeDAO();
		String outstr="";
		ArrayList<incomeDTO> list = dao.select();
		for(int i=0;i<list.size();i++) {
			incomeDTO data = new incomeDTO();
			data = list.get(i);
			JSONObject jo = new JSONObject();
			jo.put("mobile", data.getMobile());
			jo.put("seqno", data.getSeqno());
			jo.put("qty", data.getQty());
			jo.put("price", data.getPrice());
			jo.put("date", data.getIncome_date());
			ja.add(jo);
			outstr += "<option>"+data.getMobile()+" "+data.getSeqno()+" "+data.getQty()+" "
					+data.getPrice()+" "+data.getIncome_date()+"</option>";
		}
		response.getWriter().print(ja.toJSONString());
		//response.getWriter().print(outstr);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
