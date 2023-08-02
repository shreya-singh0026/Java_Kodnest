/*
Copy all elements of one array into another array:

Problem: We're given an array, and we need to create a new array that contains all the elements of the original array.

Approach: We will iterate through the given array and copy each element to the new array at the same index. 
The new array will be of the same size as the original array.

Boiler Plate Code

Class CopyArray

{

//main method and rest of the code.

}
*/

package com.kodnest.arrays.level2;

import java.util.Scanner;

public class CopyArrayElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter Array Integer : ");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Array Element : ");

		for(int i:arr) {
			System.out.print(i + " ");
			
		}
		System.out.println();

		CopyArray(arr);
		
	}
	public static void CopyArray(int arr[])
	{
		int a1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			a1[i]=arr[i];
		}
		
		System.out.print("Copied Array Element : ");

		for(int i:a1) {
			System.out.print(i + " ");
			
		}
		
	}

}
