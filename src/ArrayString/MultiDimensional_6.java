package ArrayString;

public class MultiDimensional_6 {

	public static void main(String[] args) {
		
		int a [][] = {{1,2,3,5,5},{4,5,6,6,6},{7,8,9,9,9},{10,11,12,12,12}};
		
//**********************classic for loop****************************************
		
//		for (int i=0; i<=3; i++)                  //i for loop is for rows=4
//		{
//			for (int j=0; j<=4; j++)              //j for loop is for colmn=5
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			
//			System.out.println();
//		}
	
//**********************enhanced for loop****************************************
	
		for (int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	
	
	
	}
}
