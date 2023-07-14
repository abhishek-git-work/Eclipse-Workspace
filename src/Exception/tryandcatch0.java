//exception generated and not get handled==try block executed
//exception generated and get handled==try,catch block and normal flow executed
//exception not generated ==try block and normal flow executed

package Exception;

public class tryandcatch0 {
	
	public static void main(String[] args) {

//****************exception generated and not get handled==try block executed*************************
		
//		int a=10;
//		int b=0;
//		int c=0;
//		
//		try 
//		{
//			System.out.println("risky code");
//			c=a/b;
//		}
//		
//		catch(ArithmeticException e)
//		{
//			System.out.println("alternative code");
//			b=0;
//			c=a/b;
//		}
//		
//		System.out.println(c); //normal flow
		
//******exception generated and get handled==try,catch block and normal flow executed****************		
		
//		int a=10;
//		int b=0;
//		int c=0;
//		
//		try 
//		{
//			System.out.println("risky code");
//			c=a/b;
//		}
//		
//		catch(ArithmeticException e)
//		{
//			System.out.println("alternative code");
//			b=2;
//			c=a/b;
//		}
//		
//		System.out.println(c); //normal flow
		
//***************exception not generated ==try block and normal flow executed*************************
		
		int a=10;
		int b=2;
		int c=0;
		
		try 
		{
			System.out.println("risky code");
			c=a/b;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("alternative code");
			b=2;
			c=a/b;
		}
		
		System.out.println(c); //normal flow

	}

}
