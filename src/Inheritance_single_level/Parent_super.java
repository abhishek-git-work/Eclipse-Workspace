package Inheritance_single_level;

public class Parent_super {

	public void home ()
	{
		System.out.println("home method in parent class");
	}
	
	public void car ()
	{
		System.out.println("car method in parent class");
	}
	
	public void bike ()
	{
		System.out.println("bike method in parent class");
	}
	
	public static void main(String[] args) {
		
		Parent_super x = new Parent_super();
		
		x.bike();
		x.car();
		x.home();
	}
}
