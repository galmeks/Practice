import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class reservDAO {
	Connection conn;
	Statement stmt;
	
	public ArrayList<reservDTO> canBook(String checkout,String checkin,int people,int typeNum){
		ArrayList list = new ArrayList<reservDTO>();
		try {
			connDB();
			String query = "select a.Room_num,b.name type_name,a.people,a.name,a.price from room_type b, Room a"
					+ " where type=? and people>=? and a.type=b.type_num and Room_num not in (select Room_num from reserv"
					+ " where (checkin between ? and ? or checkout between ? and ?) or (checkin<=? and checkout>=?)) ";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1,typeNum);
			psmt.setInt(2,people);
			psmt.setString(3,checkin);
			psmt.setString(4,checkout);
			psmt.setString(5,checkin);
			psmt.setString(6,checkout);
			psmt.setString(7,checkin);
			psmt.setString(8,checkout);
			ResultSet rs=psmt.executeQuery();
			while(rs.next()) {
				int R_num = rs.getInt("Room_num");
				String t_name = rs.getString("type_name");
				int peo = rs.getInt("people");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				reservDTO RDTO = new reservDTO();
				RDTO.setName(name);
				RDTO.setTypeName(t_name);
				RDTO.setPeople(peo);
				RDTO.setPrice(price);
				RDTO.setRoomNum(R_num);
				list.add(RDTO);
			}
			rs.close();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public ArrayList<reservDTO> reservList(String checkout,String checkin,int people,int typeNum){
		ArrayList list = new ArrayList<reservDTO>();
		try {
			connDB();
			String query = "select * from reserv a,Room b "
					+ "where a.Room_num=b.Room_num and type=? and b.people>=? and "
					+ "((checkin between ? and ? or checkout between ? and ?) or "
					+ "(checkin<=? and checkout>=?))";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1,typeNum);
			psmt.setInt(2,people);
			psmt.setString(3,checkin);
			psmt.setString(4,checkout);
			psmt.setString(5,checkin);
			psmt.setString(6,checkout);
			psmt.setString(7,checkin);
			psmt.setString(8,checkout);
			ResultSet rs=psmt.executeQuery();
			while(rs.next()) {
				int reserv_num = rs.getInt("reserv_num");
				String t_name = rs.getString("type");
				int peo = rs.getInt("people");
				String check_out = rs.getString("checkout");
				String check_in = rs.getString("checkin");
				String name = rs.getString("p_name");
				String r_name = rs.getString("name");
				int price = rs.getInt("price");
				reservDTO RDTO = new reservDTO();
				RDTO.setName(name);
				RDTO.setTypeName(t_name);
				RDTO.setR_name(r_name);
				RDTO.setPeople(peo);
				RDTO.setPrice(price);
				RDTO.setCheckin(check_in);
				RDTO.setCheckout(check_out);
				RDTO.setReservNum(reserv_num);
				list.add(RDTO);
			}
			rs.close();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	void addReserve(String name,String mobile, String checkin, String checkout,int people,int price,int r_num) {
		try {
			connDB();
			String query = "insert into reserv values(reserv_seq.nextval,?,?,?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setInt(1,r_num);
			psmt.setInt(2,people);	
			psmt.setString(3,checkin);
			psmt.setString(4,checkout);
			psmt.setInt(5,price);
			psmt.setString(6,name);
			psmt.setString(7, mobile);
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<reservDTO> selReserv(int reservNum){
		ArrayList list = new ArrayList<reservDTO>();
		try {
			connDB();
			String query = "select b.name, c.people maximum,a.people,a.p_name,c.name r_name,a.price,a.mobile from reserv a,room_type b,Room c where c.type=b.type_num and a.Room_num=c.Room_num and reserv_num=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt = conn.prepareStatement(query);
			psmt.setInt(1,reservNum);
			ResultSet rs=psmt.executeQuery();
			while(rs.next()) {
				
				String t_name = rs.getString("name");
				int peo = rs.getInt("people");
				String name = rs.getString("p_name");
				String r_name = rs.getString("r_name");
				int price = rs.getInt("price");
				String mobile = rs.getString("mobile");
				int r_num = rs.getInt("maximum");
				reservDTO RDTO = new reservDTO();
				RDTO.setRoomNum(r_num);
				RDTO.setName(name);
				RDTO.setTypeName(t_name);
				RDTO.setR_name(r_name);
				RDTO.setPeople(peo);
				RDTO.setPrice(price);
				RDTO.setMobile(mobile);
				list.add(RDTO);
			}
			rs.close();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void cancelReserv(int reservNum){
		try {
			connDB();
			String query = "delete reserv where reserv_num=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt = conn.prepareStatement(query);
			psmt.setInt(1,reservNum);
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void updateReserv(int reservNum,String name,String mobile, int people){
		try {
			connDB();
			String query = "update reserv set people=?,mobile=?,p_name=? where reserv_num=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt = conn.prepareStatement(query);
			psmt.setInt(1,people);
			psmt.setString(2,mobile);
			psmt.setString(3,name);
			psmt.setInt(4,reservNum);
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
