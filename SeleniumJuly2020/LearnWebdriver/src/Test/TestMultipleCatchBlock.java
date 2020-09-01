package Test;

public class TestMultipleCatchBlock {

	public static void main(String args[]) {
		try {
			int no1 = 10;
			int no2 = 0;
			int result = no1 / no2;
			System.out.println(result);
			
		} catch (ArithmeticException e1) {
			System.out.println(e1);
		
		} finally {
			System.out.println(" in finally block");
		}
	}
}