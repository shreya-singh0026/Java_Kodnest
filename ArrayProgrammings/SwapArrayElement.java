/*
Write a java program to take array length as input from user and create an integer array
Create an integer array and store elements into the array 
by taking elements as input from keyboard.
Before Swapping print the contents of array

Ask user to enter 2 indexes .
 Swap the the values of 2 indexes
After swapping print the contents of array.

Sample input output
Before swapping
Arr--> 10 20 30 40 50
After Swapping
Arr-->10 30 20 40 5
 */

package com.kodnest.arrays.level1;

import java.util.Scanner;

public class SwapArrayElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter Array Integer : ");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Print Array Integer : ");
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int help;
		help=arr[a];
		arr[a]=arr[b];
		arr[b]=help;
		
		System.out.print("Print Array Integer After Swapped : ");
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		
		
		
	    
	}

}
