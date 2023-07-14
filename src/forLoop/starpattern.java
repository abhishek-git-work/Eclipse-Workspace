package forLoop;
public class starpattern {
	public static void main(String[] args) {
		
//program-1_________________________________________				
		System.out.println("Program-1");
		for (int i=1; i<=5; i++)
		{
			System.out.println("*");
		}
//program-2_________________________________________	
		System.out.println("\nProgram-2");
		for (int i=1; i<=5; i++)
		{
			System.out.print("*");
		}
//program-3_________________________________________
		System.out.println("\n\nProgram-3");
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
//program-4_________________________________________	
		System.out.println("\nProgram-4");
		int star=1;
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=star; j++)
			{
			System.out.print("*");
			}
		System.out.println();
		star++;
		}
//program-5__________________________________________	
		System.out.println("\nProgram-5");
		
		int car=1;
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=car; j--)
			{
			System.out.print("*");
			}
		System.out.println();	
		car++;	
		}
	}
}
