import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class RoomDAO {
	Connection conn;
	Statement stmt;
	
	public ArrayList<RoomDTO> listType(){
		ArrayList list = new ArrayList<RoomDTO>();
		try {
			connDB();
			String query = "select * from room_type";
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				int R_num = rs.getInt("type_num");
				String name = rs.getString("name");
				RoomDTO RDTO = new RoomDTO();
				RDTO.setName(name);
				RDTO.setSeq(R_num);
				list.add(RDTO);
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public ArrayList<RoomDTO> listRoom(){
		ArrayList list = new ArrayList<RoomDTO>();
		try {
			connDB();
			String query = "select a.Room_num seq, a.name,b.name type_name, a.people, a.price "
						+ "from Room a,room_type b where a.type=b.type_num order by type_name";
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				int R_num = rs.getInt("Room_num");
				String name = rs.getString("name");
				String type = rs.getString("type_name");
				int people = rs.getInt("people");
				int price = rs.getInt("price");
				RoomDTO RDTO = new RoomDTO();
				RDTO.setName(name);
				RDTO.setPeople(people);
				RDTO.setPrice(price);
				RDTO.setSort(type);
				RDTO.setSeq(R_num);
				list.add(RDTO);
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void addRoom(String name, String type, int people, int price){
		try {
			connDB();
			String query = "insert into Room values(Room_seq.nextval,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1,name);
			psmt.setString(2,type);
			psmt.setInt(3,people);
			psmt.setInt(4,price);
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void updateRoom(int seq,String name, String type, int people, int price){
		try {
			connDB();
			String query = "update Room set name=?,type=?,people=?,price=? where Room_num=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1,name);
			psmt.setString(2,type);
			psmt.setInt(3,people);
			psmt.setInt(4,price);
			psmt.setInt(5,seq);
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void removeRoom(int seq){
		try {
			connDB();
			String query = "delete Room where Room_num=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1,seq);
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
