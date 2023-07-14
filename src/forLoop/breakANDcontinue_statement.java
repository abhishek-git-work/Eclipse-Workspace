package forLoop;

public class breakANDcontinue_statement {
	
	public static void main(String[] args) {
		
System.out.println("****************************************");
		
		for (int i=1; i<=10; i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);             //1 to 4 will print
		}
	
System.out.println("****************************************");
	
		for (int i=1; i<=10; i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);             //1 to 10 except 5 will print 
		}
	
	
	
	
	
	
	
	
	}

}
