package HomeWorkPrograms;

public class assign1 {
	
	int a=10;           //global var non static
	
	static int b=20;    //global var static
	
	public void aaa()
	{
		int c=12;                //local var
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	public static void main(String[] args) {
		
		assign1 x=new assign1();
		x.aaa();
		System.out.println(b);
		
		
	}
	
	

}
