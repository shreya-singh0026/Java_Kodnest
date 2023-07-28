/*

     ******
    ******
   ******
  ******
 ******
******

 */





package com.kodnest.patterns.level4;

public class MirrorRhombus {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print(" ");
			}		
			for(int j=1;j<=6;j++) {
				System.out.print("*");

			}
			System.out.println();

		
	}

}
}
