package lab1;
import java.util.Scanner;
public class cha {
	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		str = s.next();
		char[] a = str.toCharArray();
		System.out.println(a);
	}

}
