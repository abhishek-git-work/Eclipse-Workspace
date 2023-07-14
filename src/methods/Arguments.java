package methods;

public class Arguments {
	
  public static void add() {                    //user define method without argument
	  
	  int a=5;
	  int b =4;
	  int c=a+b;
	  System.out.println(c);
  }
  public void multiplication()                  // non static without argument
  {
	  int q = 5;
	  int w = 4;
	  int e= q*w;
	  System.out.println(e);
  }
  
  public void multi()                            // non static without argument
  {
	  int q = 4;
	  int w = 8;
	  int e= q*w;
	  System.out.println(e);
  }
  
  
 public static void sub(int a, int b,int c, int d)      //static with argument
 {
	  int e= a-b-c-d;
	  System.out.println(e);
 }
 
 public void division(float a, float b)                // non static with argument
 {
	  float e= a/b;
	  System.out.println(e);
 }
 
 
 
  public static void main(String[] args) {
	  
	  add();                                  //calling of static method
	  
	  Arguments r = new Arguments();          //object creation for non static
	  r.multiplication();                     // calling of non static
	  r.multi();
	  
	  
	  sub(8,4,3,2);                            // calling of static with argument
	  
	  r.division(5.25f,1.05f);                 // calling of non static with argument
}
}




