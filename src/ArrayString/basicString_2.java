package ArrayString;

public class basicString_2 {
	
	public static void main(String[] args) {
		
	
	String a = "software";
	
	String b = "software";
	
	String c = new String("Testing");
	
	String d = new String("Testing");
	
	System.out.println(a==b);	
	System.out.println(c==d);	
	System.out.println(a==c);
	
	System.out.println("-----------------------");
	
	b= "new soft";
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(a==b);
	
	System.out.println("-----------------------");
	
	b="software";
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(a==b);
	System.out.println(c);
		
	}		

}
