package Generics;

public class generic2 <D>{

	D b;                //variable b will accept any datatype
	
	public static void main(String[] args) {
		
		generic2 <String> x = new generic2 <String>();  //here we are restricting generic to only string type of data
		
		x.b = "abhishek";
		System.out.println(x.b);
		
		//x.b = 50;            //it will not accept. only string datatype will accept
		
		
		generic2 <Integer> y = new generic2 <Integer>();  //here we are restricting generic to only integer type of data
		
		y.b = 50;
		System.out.println(x.b);
		
		
	}
	
}
