package forLoop;

public class forloopbasic {

	public static void main(String[] args) {
		
//program-1______________________________________(1 to 100 numbers)	
	for (int i=1; i<=100; i++)
	{
		System.out.println(i);
	}
//program-2______________________________________(100 to 1 numbers)	
	for (int i=100; i>=1; i--)
	{
		System.out.println(i);
	}
//program-3______________________________________(1 to 100 odd numbers)	
		for (int i=1; i<=100; i+=2)
		{
			System.out.println(i);
		}
//program-4______________________________________(100 to 1 odd numbers)	
		for (int i=99; i>=0; i-=2)
		{
			System.out.println(i);
		}	
//program-5______________________________________(0 to 100 even numbers)	
		for (int i=0; i<=100; i+=2)
		{
			System.out.println(i);
		}	
//program-6______________________________________(100 to 0 even numbers)	
		for (int i=100; i>=0; i-=2)
		{
			System.out.println(i);
		}	
				
}
}