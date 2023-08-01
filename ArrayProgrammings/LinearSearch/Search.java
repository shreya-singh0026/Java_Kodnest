package com.kodnest.arrays.level2;

public class Search {
	public int linear(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				return i;
			}
		}
		return -1;
		}
}
