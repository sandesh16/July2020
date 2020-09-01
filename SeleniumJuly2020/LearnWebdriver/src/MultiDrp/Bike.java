package MultiDrp;

public class Bike {
	String sModel;

	//Constructor with values passed
	Bike(String Model) 
	{
		sModel = Model;
		System.out.println("Model of the Byke: " +  sModel);
	}

	public static void main(String args[]) {
		Bike b = new Bike("Royal Enfiled");
		
	}
}
