package lab;

public class exce {
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println("length of string="+s.length());
		}
		catch(NullPointerException ex) {
			String s="hello";
					System.out.println("length of string="+s.length());
		}
		finally {
			System.out.println("Irrespective of Exception caught,Finally block will execute");
		}
	}

}
