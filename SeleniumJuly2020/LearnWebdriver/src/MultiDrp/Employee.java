package MultiDrp;

public class Employee {

	private int id;
	private String name;
	private float sal;
	public Employee() {
	id=1;
	name="John";
	sal=10000;
	}
	public Employee(int id, String name, float sal) {
	this.id = id;
	this.name = name;
	this.sal = sal;
	}
	public void print()
	{
	System.out.println("id is "+id );
	System.out.println("name is "+name);
	System.out.println("sal is "+ sal);
	}
	public static void main(String[] args) {
	Employee e1=new Employee();
	e1.print();
	Employee e2=new Employee(2,"Rajnikant",20000f);
	e2.print();
	}
}