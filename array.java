package lab1;
import java.util.Arrays;
import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		int[] first = {23,21,4,6};
		int[] second = {45,78,45,3};
		int f = first.length;
		int s = second.length;
		int[] n = new int[f + s];
		System.arraycopy(first,0,n,0,f);
		System.arraycopy(second,0,n,f,s);
		System.out.println(Arrays.toString(n));
		
	}

}
