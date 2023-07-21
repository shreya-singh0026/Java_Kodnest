//2) Print the factorial of a number.
/*
 * Problem: We're given an integer 'N' by the user. 
 * Our task is to calculate the factorial of this number and print it. 
 * The factorial of a number is the product of all positive integers up to that number.
 * For example, the factorial of 5 (denoted as 5!) is 1 * 2 * 3 * 4 * 5 = 120.
 */

import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+ n  + " is : " + fact);

	}

}
