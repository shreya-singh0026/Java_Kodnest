//Favourite Number

/* Among all the digits from 0−90−9, PrepBuddy likes number 55. 
 * He has lots of numbers and wants you to find out the number of times 5 occurred in each number.

Input format
The first line contains an integer T denoting the number of test cases. Each of the next T lines contains a single integer N.

Output format
For each test case print, the number of times 5 occurred in N on a new line

Constraints
1<=T<=101<=T<=10 1<=N<=1061<=N<=106

Time Limit
11 ​second

Example
Input
33 12345 345654 55555

Output
1 2 5 Note - Do not use any inbuilt function for solving this question.

Sample test case explanation
12345​- contains5￼ only one time345654￼ ​- contain5 ￼ two time55555 ￼ ​- contai55s ￼ five time

 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//INPUT FORMAT
		System.out.print("Enter No of Test Cases : ");
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			System.out.print("Enter Number : ");
			int N=sc.nextInt();
			System.out.print("Enter digit : ");
			int D=sc.nextInt();
			int res=FavNumber(N,D);
			System.out.print(res + " times");
		}
	}
	
	public static int FavNumber(int num,int k) {
		int c=0;
		while(num>0) {
			int res=num%10;
			if(res==k)c++;
			num/=10;
		}
		return c;
	}

}
