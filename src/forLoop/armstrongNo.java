package forLoop;

public class armstrongNo {
	
	public static void main(String[] args) {
		
		int num=153;
		int result=0;
		
		
		for (int i=num; i>0; i=i/10)
		{
			int rem=i%10;
			result = result + (rem*rem*rem);  //rem multiply 3 times as num of digit is 3
		}
		if (num==result)
		{
			System.out.println("armstrong");
		}
		else 
		{
			System.out.println("not armstrong");
		}
		
		
		
		
	}

}
