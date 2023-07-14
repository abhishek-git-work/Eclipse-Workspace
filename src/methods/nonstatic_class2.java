//user defined non-static method within different class

/*within different class we have to create object once and then we can 
call different methods of that class from that object*/


package methods;

public class nonstatic_class2 {

	public static void main(String[] args) {
		
		nonstatic_class1 z =new nonstatic_class1();
		z.demo1();
		z.demo2();
	}
}
