//overriding of non static method part-2

package polymorphism;

public class overriding2 extends overriding1{

	public void rider ()
	{
		System.out.println("rider is resting");
	}
	
	public static void main(String[] args) {
		
	overriding2 x= new overriding2();// gives overriding output as object of sub class created
	x.rider();
		
	overriding1 y= new overriding1();// gives previous output as object of super class created
	y.rider();
		
	}
}
