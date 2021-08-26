package lab;
import java.io.IOException;
import java.util.Scanner;

class exception1 extends Exception {
	lessBalanceException(String msg) {
		super(msg);
	}
}

class Acc {
	int bal;

	Acc() {
		bal = 500;
	}

	void deposite(int amt) {
		bal = bal + amt;
	}

	void withdraw(int amt) throws lessBalanceException {
		int newbal = bal - amt;
		if (newbal < 500)
			throw new lessBalanceException("with draw amount " + amt + "is not valid");
		bal = newbal;
		System.out.println("Amount withdrawn=" + amt);
		System.out.println("Remaining bal=" + bal);
	}

	int getBalance() {
		return bal;
	}
}

public class Lab4 {

	public static void main(String args[]) throws IOException {
		int amt, choice;
		char e = 'r';
		Acc acc1, acc2, tacc = null;
		Scanner s = new Scanner(System.in);
		acc1 = new Acc();
		acc2 = new Acc();
		System.out.println("Account 1 has been created with minimum balance:" + acc1.getBalance());
		System.out.println("Account 2 has been created with minimum balance:" + acc2.getBalance());
		while (e != 'e') {
			System.out.println(
					"enter the account you want to operate:\n1:\tAccount 1,\n2:\tAccount 2\n3:\tdisplay balance of all accounts\n4:\texit\n");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				tacc = acc1;
				break;
			case 2:
				tacc = acc2;
				break;
			case 3:
				System.out.println("Account 1 has balance()");
				System.out.println("Balance :" + acc1.getBalance());
				System.out.println("Account 2 has balance()");
				System.out.println("Balance :" + acc2.getBalance());
				continue;
			case 4:
				return;
			default:
				return;
			}
			System.out.println("enter the operation:\n1:\tdeposit\n2:\twithdraw\n ");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter amt to deposite");
				amt = s.nextInt();
				if (amt > 0) {
					tacc.deposite(amt);
					System.out.println("Amount deposited");
					System.out.println("Total balance:" + tacc.getBalance());
				} else
					System.out.println("Invalid amt");
				break;
			case 2:
				System.out.println("Enter amt to withdraw");
				amt = s.nextInt();
				try {
					tacc.withdraw(amt);
				} catch (lessBalanceException e1) {
					System.out.println("amt cant be withdrawn due to:" + e1);
				}
				break;
			}

		}
	}
}