package lab1;
import java.util.Scanner;

public class one { 
	String name,address,phno,mail,branch;
	double adminfees = 20000,tufees = 30000,brfees,totfees;
	void stud(String name, String address, String phno, String mail ,String branch) {
		this.name = name;
		this.address = address;
		this.phno = phno;
		this.mail = mail;
		this.branch = branch;
	}
	double fees() {
		switch(this.branch) {
		case "MCA":
			this.brfees = 100000;
			break;
		case "BCA":
			this.brfees = 50000;
			break;
		case "BBA":
			this.brfees = 60000;
			break;
		}
		this.totfees = this.adminfees + this.tufees + this.brfees;
		return totfees;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("Student Name :");
		String name = s.nextLine();
		System.out.println("Student Address :");
		String address = s.nextLine();
		System.out.print("Student phno :");
		String phno = s.nextLine();
		System.out.println("Student mail :");
		String mail = s.nextLine();
		System.out.println("Student branch :");
		String branch = s.nextLine();
		one a = new one();
		a.stud(name,address,phno,mail,branch);
		double fee = a.fees();
		System.out.println("Student total fees is :"+a.fees());
	}

}
