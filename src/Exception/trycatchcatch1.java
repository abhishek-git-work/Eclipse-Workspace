package Exception;

public class trycatchcatch1 {
	
	public static void main(String[] args) {
		
//only one catch block will executed whichever has first in try block
	
		int a=10;
		int b=0;
		int c=0;
		int d[] = {12,34,45,65,67};
		
//		try 
//		{
//			System.out.println("risky code");
//			System.out.println(d[6]);          //now this will executed
//			c=a/b;
//		}
		
		try 
		{
			System.out.println("risky code");
			c=a/b;                            //now this will executed
			System.out.println(d[6]);          
			
		}

		
		catch(ArithmeticException e)
		{
			System.out.println("alternative code of arithematic");
			b=2;
			c=a/b;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("alternative code of array");
			System.out.println(d[2]);
		}
		
		System.out.println(c); //normal flow

	
	
}
}