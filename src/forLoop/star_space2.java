package forLoop;

public class star_space2 {
public static void main(String[] args) {
		
/*Program-1_________________________________*/System.out.println("---------------P=1");	
	
	int STARS=4; 
	int SPACES=0;

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
			STARS--;
			SPACES++;
		}
		else
		{
			STARS++;
			SPACES--;
		}			
    }			
/*Program-2_________________________________*/System.out.println("---------------P=2");	
	
	int STAR=7; 
	int SPACE=0;

	for (int i=1; i<=7; i++)
	{
		for (int j=1; j<=SPACE; j++) 
		{
			System.out.print(" ");
		}
		for (int k=1; k<=STAR; k++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		if (i<=3)
		{
			STAR-=2;
			SPACE++;
		}
		else
		{
			STAR+=2;
			SPACE--;
		}			
    }		
	
	
}
}
