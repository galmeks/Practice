

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class htmlServlet
 */
@WebServlet("/html")
public class htmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htmlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String htmlStr="<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>로그인 창</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<form name=frmLogin method=get action=login encType='Utf-8'>\r\n"
				+ "		아이디:<input type=text name=user_id><br>\r\n"
				+ "		비밀번호:<input type=password name=user_pw><br><!-- input/select/textarea -->\r\n"
				+ "		<input type=submit value='로그인'><input type=reset value='다시입력'><br>"
				+ "	</form>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		out.print(htmlStr);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
