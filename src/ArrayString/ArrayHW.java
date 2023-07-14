package ArrayString;

import java.util.Arrays;

public class ArrayHW {

	public static void main(String[] args) {
		
		int a[]= {40,30,50,10,20,80,70}; 
		int b[]= {44,30,55,11,22,80,70};
/*-------------------------------------------------------*/
		
		System.out.println("a= "+Arrays.toString(a));  //print an array
		System.out.println("b= "+Arrays.toString(b));

/*-------------------------------------------------------*/System.out.println("\nsmallest & largest values");

		Arrays.sort(a);                        //sorting in ascending order
		
		System.out.println(a[1]);              //lowest value from array i.e 1st value after sorting
		
		System.out.println(a[2]);              //2nd lowest value from array i.e 2st value after sorting
		
		System.out.println(a[a.length-1]);     //largest value from array i.e last value after sorting
		
		System.out.println(a[a.length-2]);     //2nd largest value from array i.e 2nd last value after sorting
		
/*-------------------------------------------------------*/System.out.println("\neven index values");

		for (int i=0; i<a.length; i=i+2)       //even index values of array
		{
			System.out.println(a[i]);
		}
		
/*-------------------------------------------------------*/System.out.println("\nodd index values");

		for (int i=1; i<a.length; i=i+2)       //odd index values of array
		{
			System.out.println(a[i]);
		}
		
/*-------------------------------------------------------*/System.out.println("\nsum of an array");
		
		int sum = 0;                           //sum of an array
		
		for (int i = 0; i < a.length; i++)
		{
			  sum += a[i];
		}
		System.out.println(sum);
		
/*-------------------------------------------------------*/System.out.println("\ncommon values");

		for (int i = 0; i<a.length; i++)
        {
            for (int j = 0; j<b.length; j++)
            {
                if(a[i] == (b[j]))
                { 
                 System.out.println((a[i]));
                 }
            }
        }
		
		
		
	}
}
