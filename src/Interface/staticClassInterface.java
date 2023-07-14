package Interface;

public class staticClassInterface implements staticinterface {
	
	public void xyz ()
	{
		System.out.println("implement xyz method running");
	}
	
	public static void main(String[] args) {
		
		staticClassInterface x = new staticClassInterface();
		
		x.xyz();
		
//		x.abc(); ---------------------------not applicable
//		staticClassInterface.abc();-------- not applicable
		
		staticinterface.abc();   //it is applicable as static method call by giving only that method name
	}	

}
