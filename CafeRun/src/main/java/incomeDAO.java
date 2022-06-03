import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class incomeDAO {
	private Statement stmt;
	private Connection conn;
	
	
	
	public void insert(incomeDTO idto) {
		
		try {
			connDB();
			String query="insert into income values(order_seq.nextval,?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, idto.getMobile());
			psmt.setString(2, idto.getSeqno());
			psmt.setInt(3, idto.getQty());
			psmt.setInt(4, idto.getPrice());
			psmt.setString(5, idto.getIncome_date());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<incomeDTO> select() {
		ArrayList<incomeDTO> list = new ArrayList<incomeDTO>();
		try {
			connDB();
			String query = "select a.mobile, b.name, a.qty, a.price, a.income_date from income a, menu2 b"
						+ " where a.seqno=b.seqno order by a.income_date";
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String name = rs.getString("name");
				int qty = rs.getInt("qty");
				int price = rs.getInt("price");
				String date= rs.getString("income_date");
				String mobile = rs.getString("mobile");
				incomeDTO idto = new incomeDTO();
				idto.setSeqno(name);
				idto.setQty(qty);
				idto.setPrice(price);
				idto.setMobile(mobile);
				idto.setIncome_date(date);
				list.add(idto);
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
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
	
