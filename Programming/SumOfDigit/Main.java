//Sum of Digits

/* * PrepBuddy gave you a number XX and asks you to find the sum of the digits present in the number.
 * 
Input format
One integer is provided denoting the value of XX.

Output format
Print the sum of digits of XX.

Constraints
1<=X<=1061<=X<=106

Time Limit
11 ​second

Example
Input
102345102345

Output
1515

Sample test case explanation
Sum of digit =1+0+2+3+4+5=15
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int XX=sc.nextInt();
		int res=DigitSum(XX);
		System.out.println("Sum of Digit : " + res);
	}
	
	public static int DigitSum(int XX) {
		int sum=0;
		while(XX>0) {
			int rem=XX % 10;
			sum+=rem;
			XX/=10;		
		}
		return sum;
	}

}
