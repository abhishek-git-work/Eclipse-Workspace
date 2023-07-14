package Interface;

public class defaultClassInterface2 implements defaultInterface {

	public void abhi()  //overrided default interface method 
	{
		System.out.println("overrided default interface method running");
	}
	
	public static void main(String[] args) {
		
		defaultClassInterface2 x= new defaultClassInterface2();
		
		x.abhi();    //calling of overrided default interface method
	}
}
