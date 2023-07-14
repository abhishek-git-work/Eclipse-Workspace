package Exception;

public class exeption {
	
	static void test()
	{
		throw new NullPointerException();
	}
	
	static void demo()
	{
		throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		
		System.out.println("sad");
		test();
//		demo();
		
		
	}

}
