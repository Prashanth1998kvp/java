package lab;
import java.util.Scanner;
public class sample {
	String name,address,phno,mail,branch;
	double admfees=20000,tfees=30000,brfees,totfees;
	void std(String name, String address, String phno, String mail, String branch) {
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
		this.totfees = this.admfees + this.tfees + this.brfees;
		return totfees;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("student name :");
		String name = s.nextLine();
		System.out.println("student address ;");
		String address = s.nextLine();
		System.out.println("student phno :");
		String phno = s.nextLine();
		System.out.println("student mail :");
		String mail = s.nextLine();
		System.out.println("student branch :");
		String branch = s.nextLine();
		sample a = new sample();
		a.std(name,address,phno,mail,branch);
//		double fee = a.fees();
		System.out.println("total fees is :"+a.fees());
		
	}


}
