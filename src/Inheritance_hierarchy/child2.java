package Inheritance_hierarchy;

public class child2 extends parent {

	public void result_child2()
	{
		System.out.println("presenting child2 result");
	}
	
	public static void main(String[] args) {
		
		child2 y = new child2();
		
		y.exam_1();
		y.exam_2();
		y.result_child2();
}
}
