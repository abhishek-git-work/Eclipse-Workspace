package Generics;

public class generic3 <G,L>{
	
	G b;
	
	G test(L x)
	{
		System.out.println(x);
		return b;
	}
	
	public static void main(String[] args) {
		
		generic3 <Integer,String> z = new generic3 <Integer,String>();
		
		z.b = 56;
		
		int q = z.test("Automation");
		System.out.println(q);
		
	}
	

}
