package lab;
import java.sql.*;
import java.util.Scanner;

class MyException extends Exception{
	public MyException(String str) {
		super(str);
	}
}

public class jdbc2 {
	
		void checkAge(int age) throws MyException {
			if(age>=30) {
				throw new MyException("Age is greater than 30");
			}
			else {
				System.out.println("Continue...");
			}
		}
	
		Connection getconnection() {
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java","prashanth","Prashanth@123");
				System.out.println("Connection created...");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return con;
		}
		void ins(Connection con,int sid,String name,int age,String addr) {
			try {
				Statement st = con.createStatement();
				String qry = "insert into student value("+sid+",'"+name+"',"+age+",'"+addr+"');";
				st.execute(qry);
				System.out.println("Record inserted...");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		void disp(Connection con) {
			try {
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from student;");
				System.out.println("Displaying table data...");
				while(rs.next()) {
					System.out.println("USN: "+rs.getInt(1));
					System.out.println("Name: "+rs.getString(2));
					System.out.println("Age: "+rs.getInt(3));
					System.out.println("Address: "+rs.getString(4));
					System.out.println("******************************");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		void upd(Connection con,int usn,String name){
			
			try {
				Statement st = con.createStatement();
				String qry = "update student set name='"+name+"' where sid="+usn+";";
				st.executeUpdate(qry);
				System.out.println("Record updated...");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		void del(Connection con,int usn) {
			try {
				Statement st = con.createStatement();
				String qry = "delete from student where sid="+usn+";";
				st.executeUpdate(qry);
				System.out.println("Record deleted...");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			jdbc2 obj = new jdbc2();
			int flag = 1,ch;
			int usn,age;
			String name,addr;
			Connection con = null;
			try {
				while(flag==1) {
					System.out.println("1. Create connection\n2. Insert record\n3. Display data\n4. Update record\n5. Delete record\n6. Exit");
					System.out.println("Enter your choice: ");
					ch = sc.nextInt();sc.nextLine();
					switch(ch) {
					case 1:
						con = obj.getconnection();
						break;
					case 2:
						System.out.println("Enter USN: ");
						usn = sc.nextInt();sc.nextLine();
						System.out.println("Enter Name: ");
						name = sc.nextLine();
						System.out.println("Enter Age: ");
						age = sc.nextInt();sc.nextLine();
						obj.checkAge(age);
						System.out.println("Enter Address: ");
						addr = sc.nextLine();
					
						obj.ins(con, usn, name, age, addr);
						break;
					case 3:
						obj.disp(con);
						break;
					case 4:
						System.out.println("Enter USN: ");
						usn = sc.nextInt();sc.nextLine();
						System.out.println("Enter Name to replace: ");
						name = sc.nextLine();
						obj.upd(con, usn, name);
						break;
					case 5:
						System.out.println("Enter USN to delete record: ");
						usn = sc.nextInt();sc.nextLine();
						obj.del(con, usn);
						break;
					case 6:
						flag=0;
						break;
					default:
						System.out.println("Invalid choice!!");
					}
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


