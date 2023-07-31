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
