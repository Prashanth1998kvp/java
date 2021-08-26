package lab;
import java.util.Scanner;
import shapes.*;
public class lab3b {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		square s1 = new square();
		triangle t= new triangle();
		circle c= new circle();
		int flag=1;
		while (flag==1) {
			System.out.println("1.Area of square \n2.Area circle \n3.Area of triangle \n4.Exit \nEnter ur choice");
			int ch= s.nextInt();
			s.nextLine();
			switch(ch) {
			case 1:
				System.out.println("Enter side value");
				float side= s.nextFloat();
				s1.calcarea(side);
				break;
			case 2:
				System.out.println("Enter radius value");
				float radius= s.nextFloat();
				c.calcarea(radius);
				break;
			case 3:
				System.out.println("Enter base value");
				float base= s.nextFloat();
				System.out.println("Enter height value");
				float height= s.nextFloat();
				t.calcarea(base,height);
				break;
			case 4:
				flag=0;
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
		}
	}

}
