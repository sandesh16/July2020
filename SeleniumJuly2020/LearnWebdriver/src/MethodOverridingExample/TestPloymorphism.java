package MethodOverridingExample;

public class TestPloymorphism {

	public static void main(String[] args) {
		
		Bank b=new SBI();
		System.out.println("SBI rate of interst :- " +b.getrateofinterest());
		
		Bank b1=new ICICI();
		System.out.println("ICICI rate of interst :- " +b1.getrateofinterest());
		
		Bank b3=new Axis();
		System.out.println("AXIS rate of interst :- " +b3.getrateofinterest());
		
	}

}
