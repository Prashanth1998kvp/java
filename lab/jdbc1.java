package lab;
import java.sql.*;
public class jdbc1 {

	public static void main(String[] args) {
				Connection con = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java","prashanth","Prashanth@123");
					System.out.println(con.getNetworkTimeout());
					System.out.println(con.getAutoCommit());
					System.out.println(con.getSchema());
					System.out.println(con.getClientInfo());
					System.out.println(con.getTransactionIsolation());
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from student;");
					while(rs.next()) {
						System.out.println("SlNo.: "+rs.getInt(1)+" Name: "+rs.getString(2));
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				finally {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}

