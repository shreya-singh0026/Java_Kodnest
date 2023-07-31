/*
Write a java program to take array length as input from user and create an integer array
Create an integer array and store elements into the array by taking elementsas input from keyboard. 
Print the array contents on to console if array content is positive.
*/


package com.kodnest.arrays.level1;

import java.util.Scanner;

public class CheckElementIsPositiveOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter Array Integer : ");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i:arr) {
			if(i>0)
			System.out.print((i)+ " ");
		}
		
	}

}
