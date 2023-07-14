package Inheritance_multi_level;

public class child2 extends child1 {

	
	public void abhi () 
	{
		System.out.println("abhi presenting");
	}
	
	public static void main(String[] args) {
		
		child1 x = new child1();
		
		x.test();
		x.demo1();
	}
}
