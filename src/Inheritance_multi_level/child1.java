package Inheritance_multi_level;

public class child1 extends parent{

	public void test () 
	{
		System.out.println("test presenting");
	}
	
	public static void main(String[] args) {
		
		child1 x = new child1();
		
		x.demo1();
		x.demo2();
		x.demo3();
		x.test();
	}
	
	
}
