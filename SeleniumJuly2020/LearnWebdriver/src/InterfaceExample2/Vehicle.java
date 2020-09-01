package InterfaceExample2;

public class Vehicle implements Movable,Stopable 
{
	public void move()
	{
		System.out.println("Avrage speed is " +Avg_Speed);
	}
	
	public void stop()
	{
		System.out.println("Vehicle is stop");
	}
	

}
