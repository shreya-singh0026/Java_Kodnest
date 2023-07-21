//Reverse the number

/*  PrepBuddy gave you a number X and asks you to reverse that number and print it.
Input format
One integer is provided denoting the value of X. Note - The given number doesn't have leading or ending zero's.

Output format
Print the reverse of X.

Constraints
1<=X<=1061<=X<=106

Time Limit
11 ​second

Example
Input
102345

Output
543201543201

Note - Do not use any inbuilt function for solving this question.
*/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		ReverseNumber(num);
	}
	public static void ReverseNumber(int n) {
		int rev=0;
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		System.out.println("reverse Number : "+rev);
	}

}
