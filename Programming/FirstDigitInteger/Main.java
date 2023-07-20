//  First Digit of an Integer

/*
We already saw how to find the last digit of a number. 
Let's proceed ahead with finding the first digit. 
Given a four-digit number NN, find its first digit. There will be no leading zeros in the integer NN.

Input format
The first line contains an integer TT denoting the number of test cases. Each test case contains one integer NN.

Output format
For each test case on a new line, print the first digit of NN.

Constraints
1<=T<=101<=T<=10 1000<=N<100001000<=N<10000
Time Limit
11 ​second

Example
Input
22 12341234 45674567

Output
1 4

Sample Test case Explanation
First digit of integer 12341234 is 1. First digit of integer 45674567 is 4.
\
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//INPUT FORMAT
    System.out.print("Enter the number of test cases: ");
		int TT=sc.nextInt();
		for(int i=0;i<TT;i++) {
      System.out.print("Enter the four-digit number: ");
			int NN=sc.nextInt();
			int res=FirstDigitInteger(NN);
			System.out.println(res);
	}
	}
		public static int FirstDigitInteger(int NN) 
		{
			while(NN>=10) {
				NN=NN/10;
			}	
			return NN;
		}
		
}
	
