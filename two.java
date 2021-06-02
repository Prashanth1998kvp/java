package lab;
import java.util.Scanner;

public class two {
	String name,address,phno,email,branch;
	double adminfees = 100000,tufees = 300000,branchfees,totfees;
	double fee() {
		switch(this.branch) {
		case "MCA":
			this.branchfees = 100000;
			break;
		case "BCA":
			this.branchfees = 50000;
			break;
		case "BBA":
			this.branchfees = 60000;
			break;
		}
		this.totfees = this.adminfees + this.tufees + this.branchfees;
		return totfees;
	}
	static String clgname,clgaddress,clgnumber;
	static {
		clgname = "RVCE";
		clgaddress = "Mysore road";
		clgnumber = "9986561833";
		
	}
	two () {
		System.out.println("Inside default constructor");
		
	}
	two (String name,String address,String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	}
	two (String name,String address,String phno,String email,String branch) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phno = phno;
		this.branch = branch;
	}
	void display() {
		System.out.println("**********************");
		System.out.println("Name: "+this.name);
		System.out.println("Address: "+this.address);
		System.out.println("Ph. No.: "+this.phno);
		System.out.println("Mail id: "+this.email);
		System.out.println("Branch: "+this.branch);
		System.out.println("College Name: "+clgname);
		System.out.println("College Address: "+clgaddress);
		System.out.println("College Contact: "+clgnumber);
		System.out.println("**********************");
	}
	void display(int n) {
		switch(n) {
		case 1:
			System.out.println(this.name);
			break;
		case 2:
			System.out.println(this.name);
			System.out.println(this.address);
			break;
		case 3:
			System.out.println(this.name);
			System.out.println(this.address);
			System.out.println(this.phno);
			break;
		case 4:
			System.out.println(this.name);
			System.out.println(this.address);
			System.out.println(this.phno);
			System.out.println(this.email);
			break;
		case 5:
			System.out.println(this.name);
			System.out.println(this.address);
			System.out.println(this.phno);
			System.out.println(this.email);
			System.out.println(this.branch);
			break;
		default:
			System.out.println("invalid");
		}
		
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student name: ");
		String name = s.nextLine();
		System.out.println("Enter student address: ");
		String address = s.nextLine();
		System.out.println("Enter student phone number: ");
		String phno = s.nextLine();
		System.out.println("Enter student mail: ");
		String email = s.nextLine();
		System.out.println("Enter student branch: ");
		String branch = s.nextLine();
		two t = new two();
		t.display();
		two to = new two(name,address,email);
		to.display();
		two w = new two(name,address,phno,email,branch);
		w.display();
		System.out.println("enter ur choice :");
		
		int n = s.nextInt();
		w.display(n);
		double fee = w.fee();
		System.out.println("Total fees is :"+fee);
		
	}
	

}
