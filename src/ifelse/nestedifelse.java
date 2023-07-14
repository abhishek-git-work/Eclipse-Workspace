package ifelse;

public class nestedifelse {

	public static void main(String[] args) {      
	       
	    int age=8;    
	    int weight=48;      
	        
	    if(age>=18)
	    {      
	        if(weight>50)
	        {    
	            System.out.println("You are eligible to donate blood");    
	        } 
	        else
	        {  
	            System.out.println("Sorry, first you need to gain some weight");    
	        }  
	    } 
	    else
	    {  
	      System.out.println("Age must be 18 or more");  
	    }  
	}  
}  
	

