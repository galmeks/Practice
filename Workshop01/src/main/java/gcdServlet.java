

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class gcdServlet
 */
@WebServlet("/gcdServlet")
public class gcdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gcdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String val1=request.getParameter("val1");
		String val2=request.getParameter("val2");
		if(val1==null || val2==null) {
			return;
		}
		int n_val1 = Integer.parseInt(val1);
		int n_val2 = Integer.parseInt(val2);
		int max = 0,min = 0;
		if(n_val2>n_val1) {
			int tmp=n_val1;
			n_val1=n_val2;
			n_val2=tmp;
		}
		for(int i=n_val2;i>2;i--) {
			if(n_val1%i==0&&n_val2%i==0) {
				n_val1=n_val1/i;
				n_val2=n_val2/i;
				max=i;
				min=i*n_val1*n_val2;
				break;
			}
		}
		response.getWriter().append("min = "+min);
		response.getWriter().append("\nmax = "+max);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
