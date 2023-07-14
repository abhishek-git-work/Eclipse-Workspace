package Interface;

public class implementclass implements face1,face2 {

	
	public void addition()
	{
		System.out.println("addition method running");
	}
	public void subtract()
	{
		System.out.println("subtract method running");
	}
	public void multiply()
	{
		System.out.println("multiply method running");
	}
	public void division()
	{
		System.out.println("division method running");
	}
	public void abc()
	{
		System.out.println("abc method running");
	}
	
	
	public static void main(String[] args) {
		
		implementclass x = new implementclass();
		x.addition();
		x.subtract();
		x.multiply();
		x.division();
		x.abc();
	}
}
