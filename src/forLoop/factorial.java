package forLoop;

import java.util.Scanner;

public class factorial {
	
	public static void main(String[] args) {
		
	Scanner x = new Scanner(System.in);
	
		System.out.println("please enter number: ");	
	
		int num = x.nextInt();
				
		int result=1;
		
		for (int i=1; i<=num; i++)
		{
			result = result * i;
		}
		System.out.println(result);
	}
}
