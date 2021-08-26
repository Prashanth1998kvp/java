package lab;
import java.util.Scanner;
class Person {
	
	String name,address,phno,email;
	Person (String name,String address,String phno,String email) {
		this.name=name;
		this.address=address;
		this.phno=phno;
		this.email=email;
		
	}
	
	void display() {
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.phno);
		System.out.println(this.email);
	}
	
}
class Staff extends Person implements Staff_op {
	String company,empid,designation;
	Staff(String name, String address, String phno, String email, String company,String empid, String designation) {
		super(name, address, phno, email);
		this.company=company;
		this.empid=empid;
		this.designation=designation;
	}
	@Override
	public double calcsalary() {
		return 1000;
		
	}
	void display() {
		super.display();
		System.out.println(this.company);
		System.out.println(this.empid);
		System.out.println(this.designation);
		System.out.println("salary="+this.calcsalary());
	}
	
}
class Student extends Person implements student_op {
	String usn,branch;

	Student(String name, String address, String phno, String email, String usn, String branch) {
		super(name, address, phno, email);
		this.usn=usn;
		this.branch=branch;
	}

	@Override
	public double calcfees() {
		return 2000;
	}
	void display() {
		super.display();
		System.out.println(this.usn);
		System.out.println(this.branch);
		System.out.println("fees="+this.calcfees());
	}
}
public class lab3a {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String name1,address1,phno1,email1,company,empid,designation;
		System.out.println("enter staff name1");
		name1=s.nextLine();
		System.out.println("enter staff address1");
		address1=s.nextLine();
		System.out.println("enter staff phno1");
		phno1=s.nextLine();
		System.out.println("enter staff email1");
		email1=s.nextLine();
		System.out.println("enter staff company");
		company=s.nextLine();
		System.out.println("enter staff empid");
		empid=s.nextLine();
		System.out.println("enter staff designation");
		designation=s.nextLine();
		Staff s1=new Staff(name1, address1, phno1, email1, company, empid, designation);
		s1.display();
		String name2, address2, phno2, email2, usn, branch;
		System.out.println("enter student name2");
		name2=s.nextLine();
		System.out.println("enter student address2");
		address2=s.nextLine();
		System.out.println("enter student phno2");
		phno2=s.nextLine();
		System.out.println("enter student email2");
		email2=s.nextLine();
		System.out.println("enter student usn");
		usn=s.nextLine();
		System.out.println("enter student branch");
		branch=s.nextLine();
		Student s2=new Student(name2, address2, phno2, email2, usn, branch);
		s2.display();
		
	}
}

