package com.kodnest.arrays.level2;

public class MergeElement {
	void merge(int arr1[],int arr2[]) {
		int max=(arr1.length+arr2.length);
		int arr3[]=new int[max];
		int j=0;
		for(int i=0;i<arr1.length;i++) {
			arr3[j]=arr1[i];
			j++;
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr3[j]=arr2[i];
			j++;
		}
		
		System.out.print("Array3 Element : ");
		for(int i:arr3) {
			System.out.print(i+ " ");
		}
		
	}

}
