package ifelse;

public class ladderIF {

	public static void main(String[] args) {
		
		int w=7,o=10;
		
		if ((w<=2) && (o<15))
		{
			System.out.println("Kohli will come to bat");
		}
		else if ((2<w && w<=5) && (o<35))
		{		
			System.out.println("sky will come to bat");
		}
		else if ((5<w && w<=8) && (o<45))
		{		
			System.out.println("Hardik will come to bat");
		}	
		else
		{
			System.out.println("DK will come to bat");
		}	
					
	}
	
}
