package ArrayString;

import java.util.Arrays;

public class intArraytest_1 {
	
	public static void main(String[] args) {
		
/*-----------------------------------------------*/	System.out.println("***program-a\n");
		
		int a[]= {40,30,50,10,100,80,70};  //declaration and initialization of array variable at same time
		
		System.out.println(a[1]);   //print specific value
		
		System.out.println(Arrays.toString(a));  //print all values by direct method
		
/*-----------------------------------------------*/	System.out.println("\n***program-b\n");
		
//		int b[]=new int[4]; //declaration
//		
//		b[0]=60;            //initialization
//		b[1]=70;
//		b[2]=80;
//		b[3]=90;
//
//		System.out.println(b[3]);
//		
/*-----------------------------------------------*/System.out.println("\n***all values of a Array\n");
		
		//		for (int i=0; i<=a.length-1; i++)      //print all value
		//		{
		//			System.out.println(a[i]);
		//		}
		
		for (int i:a)                      // this is enhanced for loop
		{
			System.out.println(i);
		}

/*-----------------------------------------------*/System.out.println("\n***all values of Array in reverse\n");
		
		for (int i=a.length-1; i>=0; i--)      //print all value in reverse
		{
			System.out.println(a[i]);
		}
/*-----------------------------------------------*/System.out.println("\n***swapping of Array\n");
		
		for (int i=0; i<(a.length/2); i++)
		{
			int c;
			c = a[i];
			a[i] = a[(a.length-1)-i];
			a[(a.length-1)-i] = c;
		}
		
		for (int i=0; i<=a.length-1; i++)      //print all swap value
		{
			System.out.println(a[i]);
		}
		
/*-----------------------------------------------*/System.out.println("\n***size of Array\n");
		
		int size=a.length;         //size of array program-1
		System.out.println(size);
		
//		System.out.println(b.length);   // //size of array program-2
		
/*-----------------------------------------------*/System.out.println("\n***ascending Array\n");
		
		Arrays.sort(a);      //values of array in ascending order
		
		for (int i=0; i<=a.length-1; i++)      //print all value
		{
			System.out.println(a[i]);
		}
		
/*-----------------------------------------------*/System.out.println("\n***descending Array\n");	

		Arrays.sort(a);      //values of array in descending order
		
		for (int i=a.length-1; i>=0; i--)      //print all value
		{
			System.out.println(a[i]);
		}
		



		
	}

}
