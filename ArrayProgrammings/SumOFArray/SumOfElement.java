package com.kodnest.arrays.level2;

import java.util.Scanner;

public class SumOfElement {

	public static void ArraySum(int arr[]) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum Of Array Element : " + sum);

	}

}
