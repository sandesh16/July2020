package ConstructorExample;

public class Bike2 {
	String smodel;
	
	Bike2 (String model)
	{
		smodel=model;
		System.out.println(smodel);
	}

	public static void main(String[] args) {
		 Bike2 b=new Bike2("Royal enfiled");

	}

}
