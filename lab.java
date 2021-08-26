package lab1;
import java.util.Scanner;
public class lab {

	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}

	}

}
