

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class empServlet
 */
@WebServlet("/empServlet")
public class empServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public empServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		empDAO dao = new empDAO();
		ArrayList<empDTO> list = dao.listEmp();
		
		out.print("<html><head><title>Result from emplotees</title></head><body>");
		out.print("<table border=1><tr><th>number</th><th>employee_id</th><th>employee_name</th><th>manager_name</th><th>department_name</th></tr>");
		for(int i=0;i<list.size();i++) {
			empDTO edto = list.get(i);
			int emp_id = edto.getEmployee_id();
			String emp_name = edto.getEmp_name();
			String manager_id = edto.getManager_id();
			String department_id = edto.getDepartment_id();
			out.print("<tr><td style='text-align:center;'>"+(i+1)+"</td><td>"+emp_id+"</td><td>"+emp_name+"</td><td>"+manager_id+"</td><td>"+department_id+"</td></tr>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
