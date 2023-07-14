package ArrayString;

public class ArrayWithMethods_5 {
	
	public static void test1()
	{
		int a[]= {40,30,50,10,20,80,70}; 
		
		int b[]=new int[4]; 
		
		b[0]=60;            
		b[1]=70;
		b[2]=80;
		b[3]=90;
		
		System.out.println("static method-static array");
		
		for (int i=0; i<=a.length-1; i++)      
		{
			System.out.println(a[i]);
		}
		
		System.out.println("static method-non static array");
		
		for (int i=0; i<=b.length-1; i++)      
		{
			System.out.println(b[i]);
		}
	}
	
	public void test2()
	{
		int c[]= {400,300,500,100,200,800,700}; 
		
		int d[]=new int[4]; 
		
		d[0]=600;          
		d[1]=700;
		d[2]=800;
		d[3]=900;
		
		System.out.println("non static method-static array");
		
		for (int i=0; i<=c.length-1; i++)      
		{
			System.out.println(c[i]);
		}
		
		System.out.println("non static method-non static array");
		
		for (int i=0; i<=d.length-1; i++)      
		{
			System.out.println(d[i]);
		}
	}
	
	public static void main(String[] args) {
		
		test1();
		
		ArrayWithMethods_5 x = new ArrayWithMethods_5();
		x.test2();
	}

}
