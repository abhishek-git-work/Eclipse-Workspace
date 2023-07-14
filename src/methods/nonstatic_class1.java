//user defined non-static method within same class

//within same class we have to create object once and then we can call different methods from that object

package methods;

public class nonstatic_class1 {

	public void demo1()
	{
		System.out.println("nonstatic method testing");
	}
	public void demo2()
	{
		System.out.println("demo method running");
	}
	public static void main(String[] args) {
		
		nonstatic_class1 x = new nonstatic_class1();
		x.demo1();
		x.demo2();
	}
	
}
