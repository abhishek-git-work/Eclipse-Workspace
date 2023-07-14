//exception generated and not get handled==try and finally block executed
//exception generated and get handled==try,catch,finally block and normal flow executed
//exception not generated ==try,finally block and normal flow executed

package Exception;

public class trycatchfinal {
	public static void main(String[] args) {
	
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
		
		finally
		{
			System.out.println("final block");
		}
		
		System.out.println(c); //normal flow

}
}

//exception generated and not get handled==try and finally block executed
//exception generated and get handled==try,catch,finally block and normal flow executed
//exception not generated ==try,finally block and normal flow executed