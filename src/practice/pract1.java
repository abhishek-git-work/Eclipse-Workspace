package practice;

public class pract1 {

	public static void main(String[] args) {
		
System.out.println("Program-1");
		
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

System.out.println("\nProgram-2");
		
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
System.out.println("\nProgram-3");		
		
		for (int i=1;i<=5;i++)
		{
			char alpha='A';	
			for (int j=1;j<=i;j++)
			{
				System.out.print(alpha);
				alpha++;
			}
			System.out.println();
		}

System.out.println("\nProgram-4");

		char alphabet='A';
		
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(alphabet);
			}
			alphabet++;
			System.out.println();
		}	
		
System.out.println("\nProgram-5");		
		
		char al='A';
		
		for (int i=1;i<=5;i++)
		{	
			for (int j=1;j<=i;j++)
			{
				System.out.print(al);
				al++;
			}
			System.out.println();
		}		
		
System.out.println("\nProgram-6");
		
		for (int i=1;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

System.out.println("\nProgram-7");

		int num=5;
		
		for (int i=1;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print(num);
			}
			num--;
			System.out.println();
		}
		
	}
	
}
