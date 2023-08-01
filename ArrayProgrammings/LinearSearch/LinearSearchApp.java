package com.kodnest.arrays.level2;

import java.util.Scanner;

public class LinearSearchApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter Array Integer : ");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter key : ");
		int key =sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				System.out.print("Element found ");
				return;
			}
		}
				System.out.print("Element not found ");
		}
		
	}
