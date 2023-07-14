//trycatch block in another try block possible but not required

package Exception;

public class trytrycatchcatch4 {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int c=0;
		int d[] = {12,34,45,65,67};
		
		
		try 
		{
			System.out.println("risky code");
			c=a/b;                            
			System.out.println(d[6]);      
			
			try 
			{
				System.out.println("risky code");
				c=a/b;                            
				System.out.println(d[6]);          
				
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("alternative code of arithematic");
				b=2;
				c=a/b;
			}
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("alternative code of arithematic");
			b=2;
			c=a/b;
		}
	
	}	
}
