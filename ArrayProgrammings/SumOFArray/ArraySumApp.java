package com.kodnest.arrays.level2;

import java.util.Scanner;

public class ArraySumApp {

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
		SumOfElement s=new SumOfElement();
				s.ArraySum(arr);
	}

}
