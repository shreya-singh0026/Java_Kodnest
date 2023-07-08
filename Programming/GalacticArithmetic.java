/*In a far-off galaxy named Arithmetica, beings have been using a newly discovered number system to make their life easier.
 * z However, they are facing difficulties in performing basic arithmetic operations. As the resident genius of planet Earth,
 *  you have been called upon to help them. Your first task is to build a function that will be able to add two numbers in their number system.

Function:
public static long galacticAddition(long num1, long num2);

Inputs:
The function galacticAddition(long num1, long num2) will receive two parameters:
- num1 : a long integer representing the first number in the Arithmetica number system.
- num2 : a long integer representing the second number in the Arithmetica number system.

Outputs:
The function will return a long - the sum of num1 and num2 in the Arithmetica number system.

Sample Input:
125678
9876543210L

Sample Output:
9876668888L

Note:
In the sample input, the two numbers provided to the function are 125678 and 9876543210. 
The sum of these two numbers is 125678+9876543210=9876668888, so the function returns 9876668888 as the output.
Your task is to help the beings of Arithmetica perform this basic operation with ease. Good luck, Earth's genius
 */

package program_kodnest;
import java.util.*;
public class GalaciticArithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		long result=galacticAddition(num1,num2);
		System.out.println(result);
			
	}
	
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}


}
