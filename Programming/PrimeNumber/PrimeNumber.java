//4. Check whether a number is prime or not.
/*
Problem: A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. 
The task is to check whether a number entered by the user is prime or not.

Approach: We'll start by checking if the number is less than 2; if it is, it's not a prime number. 
Then, we'll check divisibility from 2 up to the square root of the number 
(since a larger factor of the number would be a multiple of a smaller factor that has already been checked). 
If we find any number that divides, we'll conclude that the number isn't prime. 
If no such number is found, it's prime.
*/

import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) {
			System.out.println(n+" is not a Prime Number.");
			return ;
		}
				
		
		for(int i=2;i<n;i++) {
		if(n%i==0) {
				System.out.println(n+" is not a Prime Number.");
				return;
			}
		}
				System.out.println(n+" is a Prime Number.");
				
	}

}
