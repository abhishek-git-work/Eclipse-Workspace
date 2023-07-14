package forLoop;
public class Star_Space {
public static void main(String[] args) {
	
/*Program-1_________________________________*/System.out.println("---------------P=1");	
	int star=5; 
	int space=0;
	
	for (int i=1; i<=5; i++)
	{
		for (int j=1; j<=space; j++)
		{
			System.out.print(" ");
		}
		for (int k=1; k<=star; k++)
		{
			System.out.print("*");
		}
		System.out.println();
		space++;
		star--;
	}	
	
/*Program-2___________________________________*/System.out.println("---------------P=2");
	 int st=1;
	 int sp=4;
	 
	 for (int i=1; i<=5; i++)
	 {
		 for (int j=1; j<=sp; j++)
		 {
			 System.out.print(" ");
		 }
		 for (int k=1; k<=st; k++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
		 sp--;
		 st++;
	 }
	
/*Program-3___________________________________*/System.out.println("---------------P=3");	 
		int str=7; 
		int spc=0;
		
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=spc; j++)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=str; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			spc++;
			str-=2;
		}

/*Program-4___________________________________*/System.out.println("---------------P=4");	 
		int star1=5; 
		int space1=0;
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=space1; j++)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=star1; k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			space1++;
			star1--;
		}
/*Program-5___________________________________*/System.out.println("---------------P=5");	 
		int stars=1; 
		int spaces=3;
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=spaces; j++)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=stars; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			spaces--;
			stars+=2;
		}
/*Program-6___________________________________*/System.out.println("---------------P=6");		
		int Stars=1; 
		int Spaces=3;
		for (int i=1; i<=7; i++)
		{
			for (int j=1; j<=Spaces; j++) 
			{
				System.out.print(" ");
			}
			for (int k=1; k<=Stars; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if (i<=3){
				Stars+=2;
				Spaces--;
			}
			else{
				Stars-=2;
				Spaces++;
			}			
	    }
/*Program-7___________________________________*/System.out.println("---------------P=7");		
		int STARS=1; 
		int SPACES=3;

		for (int i=1; i<=7; i++)
		{
			for (int j=1; j<=SPACES; j++) 
			{
				System.out.print(" ");
			}
			for (int k=1; k<=STARS; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if (i<=3)
			{
				STARS++;
				SPACES--;
			}
			else
			{
				STARS--;
				SPACES++;
			}			
	    }	
/*Program-8___________________________________*/System.out.println("---------------P=8");		
		int Star2=1; 
		int Space2=3;

		for (int i=1; i<=7; i++)
		{
			for (int j=1; j<=Space2; j++) 
			{
				System.out.print(" ");
			}
			for (int k=1; k<=Star2; k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
			if (i<=3)
			{
				Star2++;
				Space2--;
			}
			else
			{
				Star2--;
				Space2++;
			}			
	    }		
}
}
