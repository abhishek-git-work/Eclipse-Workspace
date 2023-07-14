package forLoop;

import java.util.Scanner;

public class primeNo {
	
	public static void main(String[] args) {
		
		Scanner x = new Scanner (System.in);
		
		System.out.println("please enter number: ");
		
		int n = x.nextInt();
		
		if (n==0 || n==1)
		{
			System.out.println("Not Prime");
		}
		else
		{
			for(int i=2;i<n;i++) 
			{
		        if(n % i == 0) 
		        {
		            System.out.println("Not Prime");
		            return;
		        }
		    }
			System.out.println("Prime");
		}    
		
		
	}
}
