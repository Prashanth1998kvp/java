package lab;

public class Thows_example {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Throws_example te = new Throws_example();
			try {
			te.Arithe_examp();
			}catch(ArithmeticException e) {
				System.out.println("in arithmeticexception");
			}catch(NullPointerException e) {
				System.out.println("in nullpointerexception");
			}
			System.out.println("after method call");
		}
		
		public void Arithe_examp() throws ArithmeticException,NullPointerException{
			this.Null_example();
			int a =0,b=10;
			int c = b/a;
			
		}
		
		public void Null_example() throws NullPointerException{
			String s = null;
			s.length();
		}

	}

}
