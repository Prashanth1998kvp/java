package lab1;
import java.util.Scanner;
public class add {
	int add(int a,int b) {
		int sum = a + b;
		return sum;
	}
	public static void main(String[] args) {
		add ad = new add();
		Scanner s = new Scanner(System.in);
		int a,b,sum;
		a = s.nextInt();
		b = s.nextInt();
	    sum = ad.add(a,b);
	    System.out.println("total :"+sum);
		}
		
	}


