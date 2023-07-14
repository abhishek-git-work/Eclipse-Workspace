//overloading concept apply only within same class
//overloading of static and non static method

package polymorphism;

public class overloading {

//static method declaration______________________________
	
	public static void action ()
	{
		System.out.println("action w/o parameter");
	}	
	public static void action (int a, int b)
	{
		System.out.println(a*b);
	}	
	public static void action (int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	
//non-static method declaration______________________________
	
	public void camera ()
	{
		System.out.println("camera w/o parameter");
	}
	public void camera (int q, int w)
	{
		System.out.println(q-w);
	}
	
	public static void main(String[] args) {
//static method calling______________________________		
		action();
		action(12,12);
		action(20,20,30);
//non-static method calling______________________________	
		overloading x = new overloading();
		x.camera();
		x.camera(50, 20);
	}
}
