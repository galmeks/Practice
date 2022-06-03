import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class menuDAO {
	private Statement stmt;
	private Connection conn;
	
	public ArrayList<menuDTO> listMenu(){
		ArrayList<menuDTO> list = new ArrayList<menuDTO>();
		try {
			connDB();
			String query = "select * from menu";
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				int sq_num = rs.getInt("seqno");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				menuDTO mdto = new menuDTO();
				mdto.setSq_num(sq_num);
				mdto.setName(name);
				mdto.setPrice(price);
				list.add(mdto);
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	void insert(String name,int price) {
		try {
			connDB();
			String query = "insert All "
					+ "into menu values(sq.nextval,?,?) "
					+ "into menu2 values(sq2.nextval,?,?) "
					+ "select * from dual";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, name);
			psmt.setInt(2, price);
			psmt.setString(3, name);
			psmt.setInt(4, price);
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void modify(menuDTO mdto) {
		try {
			connDB();
			String query = "update menu set seqno=sq.nextval, price=?, name=? where seqno=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1, mdto.getPrice());
			psmt.setString(2, mdto.getName());
			psmt.setInt(3, mdto.getSq_num());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void modify2(menuDTO mdto) {
		try {
			connDB();
			String query = "insert into menu2 values(sq2.nextval,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(2, mdto.getPrice());
			psmt.setString(1, mdto.getName());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void remove(String id) {
		try {
			connDB();
			String query = "delete menu where seqno=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, id);
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
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
