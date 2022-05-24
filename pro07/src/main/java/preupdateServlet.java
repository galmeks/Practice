

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/update")
public class preupdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public preupdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
		MemberVO mvo = dao.getMember(id);
		out.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset='UTF-8'>\r\n"
				+ "<title>AddNew into t_member</title>\r\n"
				+ "</head>\r\n"
				+ "<body align=center>\r\n"
				+ "<form method='get' action=modify id=frmAddnew>\r\n"
				+ "<table align=center border=1>\r\n"
				+ "<tr><td>ID</td><td><input type=text name=id value='"+mvo.getId()+"' readonly></td></tr>\r\n"
				+ "<tr><td>비밀번호</td><td><input type=text name=password value='"+mvo.getPwd()+"'></td></tr>\r\n"
				+ "<tr><td>이름</td><td><input type=text name=name value='"+mvo.getName()+"'></td></tr>\r\n"
				+ "<tr><td>모바일</td><td><input type=text name=mobile value='"+mvo.getMobile()+"'></td></tr>\r\n"
				+ "<tr><td>등록일</td><td><input type=date name=joindate value='"+mvo.getJoindate()+"'></td></tr>\r\n"
				+ "<tr><td colspan=2 align=center><input type=submit value=수정완료><input type=reset value=비우기></td></tr>\r\n"
				+ "</table>\r\n"
				+ "</form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
