//Problem: The String Joiner

/*You are creating a new social networking site.
 *  In one of the features, you have to combine the user's first name and last name to display the full name.
 *   Your task is to write a static method that will concatenate two strings.

Function:
public static String joinStrings(String str1, String str2);

Inputs:
The function joinStrings(String str1, String str2) will receive two parameters:
- str1 :a string which represents the first string.
- str2 : a string which represents the second string.

Outputs:
The function will return a string - the result of concatenating str1 and str2.

Sample Input:
joinStrings("Hello, ", "World!");

Sample Output:
"Hello, World!"

Note:
In the sample input, the function is given two strings: "Hello, " and "World!".
 These two strings are concatenated to form "Hello, World!", which is the output.
  Make sure your function works properly to display the user's full name correctly on the social networking site.
*/

import java.util.*;
public class StringJoiner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		System.out.print(joinStrings( str1 , str2));		
		System.out.println();
		System.out.println(joinStringss( "Shreya " , "Singh"));
	}
	
	public static String joinStrings(String str1, String str2) {
		return str1 + str2;
	}
	public static String joinStringss(String str3, String str4) {
		return str3.concat(str4);
	}
}
