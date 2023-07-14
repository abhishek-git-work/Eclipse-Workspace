package forLoop;

public class AlphaNum {

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

System.out.println("\nProgram-8");

		int num1=5;
		
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=num1; j--)
			{
				System.out.print(j);
			}
			num1--;
			System.out.println();
		}
		
System.out.println("\nProgram-9");

		int num2=5;
		int space2=4;
		
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=space2; j++)
			{
				System.out.print(" ");
			}
			for (int j=5; j>=num2; j--)
			{
				System.out.print(j);
			}
			num2--;
			space2--;
			System.out.println();
		}
		
System.out.println("\nProgram-10");

		int num3=5;
		int space3=4;
		
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=space3; j++)
			{
				System.out.print(" ");
			}
			for (int j=5; j>=num3; j--)
			{
				System.out.print(j+" ");
			}
			num3--;
			space3--;
			System.out.println();
		}
		
System.out.println("\nProgram-11");

		int num4=5;
		int space4=4;
		
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=space4; j++)
			{
				System.out.print(" ");
			}
			for (int j=5; j>=num4; j--)
			{
				System.out.print(num4+" ");
			}
			num4--;
			space4--;
			System.out.println();
		}

System.out.println("\nProgram-12");

		int num11=5;
		
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=num11; j--)
			{
				System.out.print(num11);
			}
			num11--;
			System.out.println();
		}
		
System.out.println("\nProgram-13");

		int num12=1;
		
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(num12+" ");
				num12++;
			}
			System.out.println();
		}
		
System.out.println("\nProgram-14");

		int num14=5;
		
		for (int i=1;i<=5;i++)
		{
			for (int j=num14;j<=5;j++)
			{
				System.out.print(j);
			}
			num14--;
			System.out.println();
		}
		
System.out.println("\nProgram-15");

		int num15=5;
		int space15=4;
		
		for (int i=1;i<=5;i++)
		{
			for (int k=1; k<=space15; k++)
			{
				System.out.print(" ");
			}
			for (int j=num15;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			num15--;
			space15--;
			System.out.println();
		}
		
System.out.println("\nProgram-16");

		char alpha16='E';
		
		for (int i=1;i<=5;i++)
		{
			for (char j=alpha16; j<='E'; j++)
			{
				System.out.print(j+" ");
			}
			alpha16--;
			System.out.println();
		}
		
System.out.println("\nProgram-17");

		char alpha17='E';
		int space17=4;
		
		for (int i=1;i<=5;i++)
		{
			for (int k=1; k<=space17; k++)
			{
				System.out.print(" ");
			}
			for (char j=alpha17; j<='E'; j++)
			{
				System.out.print(j+" ");
			}
			alpha17--;
			space17--;
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
