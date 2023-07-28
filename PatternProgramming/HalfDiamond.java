/*

*
**
***
****
*****
******
*****
****
***
**
*


*/

package com.kodnest.patterns.level6;

public class HalfDiamond {

	public static void main(String[] args) {
		//upper part of half diamond
		for(int i=1;i<=6;i++) {	
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		//lower part of half diamond
		for(int i=1;i<=6;i++) {	
		for(int j=5;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
}
}
}