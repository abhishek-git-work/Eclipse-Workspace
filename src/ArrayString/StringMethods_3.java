package ArrayString;

import java.util.Arrays;

public class StringMethods_3 {
	
	public static void main(String[] args) {
		
		String s1="abhishek";
		String s2="shek";
		String s3="abhi";
		String s4="newone";
		String s5="NEW ONE";
		String s6="   we are using trim method of string  ";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.contains(s3));
		System.out.println(s1.contains("sh"));
		System.out.println(s3.replace("a", "x"));
		System.out.println(s3.concat(s2));
		System.out.println(s2.isEmpty());
		System.out.println(s2.isBlank());
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1, 4));
		System.out.println(s1.startsWith(s3));
		System.out.println(s1.endsWith(s2));
		System.out.println(s4.indexOf("n"));
		System.out.println(s4.lastIndexOf("n"));
		System.out.println(s1.indexOf(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s5.equalsIgnoreCase(s4));
		System.out.println(s5.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s6.trim());
		
		String a= String.join(s1,s2,s3);    //here s1 joins s2 and s3
		System.out.println(a);
		
		String b= String.join(s1,s2,s3,s4);    //here first s1 joins s2 and s3 and then s1 joins s3 and s4 
		System.out.println(b);
		
		String[] c= s5.split(" ");
		System.out.println(Arrays.toString(c));  //string is separated from space
		
	
	
	
	
	
	
	}

}
