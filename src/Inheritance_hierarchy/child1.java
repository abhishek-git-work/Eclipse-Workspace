package Inheritance_hierarchy;

public class child1 extends parent{

	public void result_child1()
	{
		System.out.println("presenting child1 result");
	}
	
	public static void main(String[] args) {
		
		child1 y = new child1();
		
		y.exam_1();
		y.exam_2();
		y.result_child1();
	}
	
	
}
