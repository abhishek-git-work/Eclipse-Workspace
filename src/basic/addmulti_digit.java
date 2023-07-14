package basic;

import java.util.Scanner;

public class addmulti_digit{  

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("please give number: ");
		
		int a = input.nextInt();
		
		int sum = 0;
		int multi = 0;
		
		sum = (a/10) + (a%10);
		multi = (a/10) * (a%10);
		
		System.out.println(sum);
		System.out.println(multi);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
