package Genralization;

public class output {

	public static void main(String[] args) {
		
		System.out.println("-----dell-----");
		
		dell x = new dell();
		x.battery();
		x.processor();
		x.harddisk();
		
		System.out.println("\n-----hp-----");
		
		hp y = new hp();
		y.battery();
		y.processor();
		y.harddisk();
		y.harddisk_extra();
		
		System.out.println("\n-----lenovo-----");
		
		lenovo z = new lenovo();
		z.battery();
		z.processor();
		z.harddisk();
		z.graphics_card();
	}
}
