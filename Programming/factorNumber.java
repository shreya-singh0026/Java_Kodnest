//3. Print all the factors of a number.
/* Problem: We're given an integer 'N' by the user. 
 * Our task is to print all factors of this number. 
 * Factors are numbers that divide evenly into another number. 
 * For example, the factors of 10 are 1, 2, 5, and 10 because these numbers divide 10 without leaving a remainder.
 * */

import java.util.*;
public class factorNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		int n=sc.nextInt();
		System.out.print("Factor of "+ n + " is : ");
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				System.out.print(i+" ");
;
		}
	}

}
