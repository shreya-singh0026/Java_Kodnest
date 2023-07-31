/*
Write a java program to take array length as input from user and create an integer array
Take elements from user and store elements into the array

Call a method printArray present in PrintArray class which will 
print the array in forward direction and in reverse direction.
 
*/


package com.kodnest.arrays.level1;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter Array Integer : ");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		PrintArray(arr);
		
	}
	public static void PrintArray(int arr[]) {
		System.out.print("Print Array Integer : ");
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		System.out.print("Print Reverse Array Integer : ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+ " ");

		}
	}

}
