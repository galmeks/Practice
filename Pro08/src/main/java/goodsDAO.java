import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class goodsDAO {

	Connection conn;
	Statement stmt;
	
	public ArrayList <goodsDTO> select() {
		ArrayList list = new ArrayList<goodsDTO>();
		try {
			connDB();
			String query = "select * from exp_goods";
			this.stmt =conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String country = rs.getString("country");
				String sqeno = rs.getString("seq");
				String name = rs.getString("goods");
				goodsDTO gdto = new goodsDTO();
				gdto.setCountry(country);
				gdto.setSeqno(sqeno);
				gdto.setGoodsname(name);
				list.add(gdto);
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void insert(goodsDTO gdto) {
		try {
			System.out.println("country="+gdto.getCountry()+", seqno="+gdto.getSeqno()+", name="+gdto.getGoodsname());
			connDB();
			String query = "insert into exp_goods values(?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1,gdto.getCountry());
			psmt.setString(2,gdto.getSeqno());
			psmt.setString(3,gdto.getGoodsname());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delList(String country, String seq,String name) {
		try {
			connDB();
			String query = "delete exp_goods where country=? and seq=? and goods=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1,country);
			psmt.setString(2,seq);
			psmt.setString(3,name);
			psmt.executeUpdate();
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void connDB() {
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
