package Encapsulation;

public class Encap1 {

	private int a=12;
	private int b=30;
	private int c=a+b;
			
	public void aaa ()
	{
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
	 Encap1 x= new Encap1();
	 x.aaa();
	}
}
