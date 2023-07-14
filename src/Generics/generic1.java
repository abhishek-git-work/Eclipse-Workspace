package Generics;

public class generic1 <G>{                     //given value of generic as G. we can assign any value.
	
	int a;
	G b;                						//variable b will accept any datatype
	
	public static void main(String[] args) {
		
		generic1 x = new generic1();
		
		x.a = 20;           		 	//only integer datatype will accept
		System.out.println(x.a);
		
		x.b = 40;                		//any datatype will accept
		System.out.println(x.b);
		
		x.b = "abhishek";
		System.out.println(x.b);
		
		x.b = 34.55f;
		System.out.println(x.b);
		
		
		
	}

}
