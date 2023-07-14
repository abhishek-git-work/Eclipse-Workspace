package Inheritance_single_level;

public class child_sub extends Parent_super {

	public void test ()
	{
		System.out.println("test method in child class");
	}
	
	public static void main(String[] args) {
		
		child_sub z = new child_sub();
		
		z.test();
		z.bike();
		z.car();
		z.home();
				
	}
}
