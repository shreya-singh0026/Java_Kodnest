/*
Merge elements of 2 arrays into a 3rd array:

Problem: 
We have two arrays, and we want to combine them into a third array.

Approach: 
We will create a third array that has a size equal to the sum of the sizes of the first two arrays. 
We'll then copy all elements from the first array to the third array, and 
then continue where we left off by copying all elements from the second array to the third array.

*/
package com.kodnest.arrays.level2;

import java.util.Scanner;

public class MergeElementApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int arr1[]=new int[sc.nextInt()];
		System.out.print("Enter Array1 Integer : ");

		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.print("Enter Array Size : ");
		int arr2[]=new int[sc.nextInt()];
		System.out.print("Enter Array2 Integer : ");

		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		System.out.print("Array1 Element : ");

		for(int i:arr1) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		System.out.print("Array2 Element : ");

		for(int i:arr2) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		MergeElement m=new MergeElement();
		m.merge(arr1,arr2);
	}

}
