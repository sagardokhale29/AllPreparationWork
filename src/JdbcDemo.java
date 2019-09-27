import java.sql.*;
public class JdbcDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
				PreparedStatement ps=con.prepareStatement("select * from empuser");
				ResultSet rs=ps.executeQuery();) {
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	   


}
