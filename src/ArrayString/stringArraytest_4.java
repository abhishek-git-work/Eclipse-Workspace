package ArrayString;

import java.util.Arrays;

public class stringArraytest_4 {

	public static void main(String[] args) {

		System.out.println("***program-a\n");// --------------------------------------------------

		String a[] = { "abhi", "shek", "jeet", "joy" }; // declaration and initialization at same time

		System.out.println(a[2]);

		System.out.println("\n***program-b\n");// --------------------------------------------------

		String b[] = new String[4]; // declaration

		b[0] = "seema"; // initialization
		b[1] = "geeta";
		b[2] = "neha";
		b[3] = "kyara";

		System.out.println(b[2]);

		System.out.println("\n***all string\n");// --------------------------------------------------------------

		System.out.println(Arrays.toString(a));

//		for (int i=0; i<=a.length-1; i++)
//		{
//			System.out.println(a[i]);
//		}

		System.out.println("\n***swapping of string\n");// --------------------------------------------------------------

		for (int i = 0; i < (a.length / 2); i++) {
			String c;
			c = a[i];
			a[i] = a[(a.length - 1) - i];
			a[(a.length - 1) - i] = c;
		}

		System.out.println(Arrays.toString(a));

//		for (int i=0; i<=a.length-1; i++)      //print all swap value
//		{
//			System.out.println(a[i]);
//		}

		System.out.println("\n***string in ascending order\n");// --------------------------------------------------------------

		Arrays.sort(a);
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}

		System.out.println("\n***reverse string\n");// --------------------------------------------------------------

		String x = "abhishek";
		String result = "";

		for (int i = x.length() - 1; i >= 0; i--) {
			result = result + x.charAt(i);
		}
		System.out.println("original string = " + x);
		System.out.println("reverse string = " + result);

		System.out.println("\n***palindrome string\n");// --------------------------------------------------------------

		String y = "radar";
		String result1 = "";

		for (int i = y.length() - 1; i >= 0; i--) {
			result1 = result1 + y.charAt(i);
		}

		if (y.equals(result1)) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("string is not a palindrome");
		}

		System.out.println("\n***duplicate character count\n");// --------------------------------------------------------------

		String z = "abhishek bramhankar";
		int total = 0;

		for (int i = 0; i <= z.length() - 1; i++) {
			if (z.charAt(i) == 'a') {
				total++;
			}
		}
		System.out.println(total);

		System.out.println("\n***convert string into alphabetical order\n");// --------------------------------------------------------------

		String a1 = "abhishek";

		char[] a2 = a1.toCharArray();

		Arrays.sort(a2);

		System.out.println(a2);

		System.out.println("\n***convert string into sequence of character\n");// --------------------------------------------------------------

		String c = "abhishek";

		char[] d = c.toCharArray();

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

		System.out.println("\n***reverse each word in string at same position\n");// --------------------------------------------------------------

		String m = "my name is suraj";

		String[] words = m.split(" ");

		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);

	}

}
