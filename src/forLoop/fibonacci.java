package forLoop;

public class fibonacci {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int total=10; //here we declare limit to result upto 10 numbers
		int c;
		
		System.out.print(a+" "+b);
		
		for (int i=2; i<total; i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	}

}
