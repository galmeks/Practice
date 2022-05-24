import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class empDAO {
	private Statement stmt;
	private Connection conn;
	
	public ArrayList <empDTO> listEmp(){
		ArrayList<empDTO> list = new ArrayList<empDTO>();
		try {
			connDB();
			String query = "Select a.employee_id,a.emp_name,b.emp_name manager_name,c.department_name "+
						   "from employees a,employees b,departments c "+
						   "where a.manager_id = b.employee_id "+
						   "and a.department_id = c.department_id";
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				int employee_id = rs.getInt("employee_id");
				String emp_name = rs.getString("emp_name");
				String m_name = rs.getString("manager_name");
				String d_name = rs.getString("department_name");
				empDTO edto = new empDTO();
				edto.setEmployee_id(employee_id);
				edto.setEmp_name(emp_name);
				edto.setManager_id(m_name);
				edto.setDepartment_id(d_name);
				list.add(edto);
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	private void connDB() {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid="ora_user";
		String passcode="human123";
		try {
			Class.forName(driver);
			this.conn=DriverManager.getConnection(url,userid,passcode);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
