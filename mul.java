package lab1;
import java.util.Arrays;
import java.util.Scanner;
public class mul {
	public static void main(String[] args) {
		String c = "";
		int[] first = {2,4,6,8};
		int[] second = {1,3,5,7};
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));
		for(int i = 0; i < first.length; i++) {
			int a = first[i];
			int b = second[i];
			c += Integer.toString(a * b) + " ";
		}
		System.out.println("result: "+c);
	}

}
