package lab;
import java.sql.*;
import java.util.*;
public class jdbc {
	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		Connection con = null;
		Statement st = null;
		int usn,age;
		String name,address;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java","prashanth","Prashanth@123");
			System.out.println("connection is done");
			
			st = con.createStatement();
			System.out.println("enter usn");
			usn = se.nextInt(); se.nextLine();
			System.out.println("enter name");
			name = se.nextLine();
			System.out.println("enter age");
			age = se.nextInt();se.nextLine();
			System.out.println("enter address");
			address = se.nextLine();	
			String q1 = "insert into student value("+usn+",'"+name+"',"+age+",'"+address+"');";
			st.execute(q1);
			
			ResultSet rs = st.executeQuery("select * from student;");
			System.out.println("Displaying table data...");
			while(rs.next()) {
				System.out.println("USN: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Age: "+rs.getInt(3));
				System.out.println("Address: "+rs.getString(4));
				System.out.println("******************************");
			}
			-
			System.out.println("enter name to replace");
			name = se.nextLine();
			System.out.println("enter usn");
			usn = se.nextInt();
			String q2 = "update student set name='"+name+"' where sid="+usn+";";
			st.executeUpdate(q2);
			System.out.println("Record updated...");
			
			System.out.println("enter usn to delete");
			usn = se.nextInt();
			String qry = "delete from student where sid="+usn+";";
			st.executeUpdate(qry);
			System.out.println("Record deleted...");
		}
		
		catch (Exception e) {
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
