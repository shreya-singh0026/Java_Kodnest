//1. Print the sum of N natural numbers where N is an integer input by the user.
/*
Problem: We are given a positive integer N by the user.
Our task is to calculate the sum of the first N natural numbers and print it out. 
Natural numbers are simply numbers that you naturally count, i.e., 1, 2, 3, and so on.

For example, if N is 5, we want to calculate the sum 1+2+3+4+5, which equals 15.
*/

import java.util.*;
public class NaturalNumberSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of the first "+ n + " natural numbers : " + sum);
	}

}
