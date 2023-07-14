
//user defined static method within same class

package methods;

public class static_class1 {

	static void test1()  //declaration of user defined method-1-void
	{
		int a=12;
		int b=18;
		int c=a+b;
		System.out.println(c);
	}	
	static String test2()   //declaration of user defined method-2-string data type
	{
	
	return "testing";
	}	
	static int test3()     //declaration of user defined method-3-integer data type
	{
		return 12; 		
		
	}	
	public static void main(String[] args) {
		
		test1();                     //calling of user defined method-1
        
//		test2();
		
//		test3();
		String d=test2();            //calling of user defined method-2
		System.out.println(d);
		
		int e=test3();               //calling of user defined method-3
		System.out.println(e);		
	}
}
 