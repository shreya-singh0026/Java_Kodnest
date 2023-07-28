/*
2) Write a java Program to create an integer array by taking length as input from the user . 
Take the contents of the array from user and store the contents in the array. 
Display the contents of the array by incrementing each value present in the array by 5 on to the console.

*/

package com.kodnest.arrays.level1;

import java.util.Scanner;

public class CreateAnArray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter Array Integer : ");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Print Array Integer : ");

		/*   Traditional Method
		for(int i=0;i<arr.length;i++) {
			System.out.print((arr[i]+5)+ " ");
		}
	    */
		
		for(int i:arr) {
			System.out.print((i+5)+ " ");
		}
		
	}

}
