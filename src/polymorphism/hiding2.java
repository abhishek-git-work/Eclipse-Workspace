//method hiding part-2

package polymorphism;

public class hiding2 extends hiding1{

	public static void demo()
	{
		System.out.println("demo of sub-child class");
	}
	
	public static void main(String[] args) {
		
		demo(); //method hiding is done, as hiding1 method get hide and hiding2 method result shows
		
		hiding2.demo(); //same as above
		
		hiding1.demo(); //here hiding2 method gets hide and result of hiding1 method is shown
		
		
	}
	
}
