/*

      **
     ****
    ******
   ********
  **********
 ************
 ************
  **********
   ********
    ******
     ****
      **

*/

package com.kodnest.patterns.level6;

public class DiamondPattern {

	public static void main(String[] args) {
		//upper half traingle
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i;j++) {
				System.out.print("*");
			}		
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}	
			System.out.println();
		}
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}			
			for(int j=6;j>=i;j--){
				System.out.print("*");
			}
			for(int j=6;j>=i;j--) {
				System.out.print("*");
			}
					
			System.out.println();
		}
		
		
	}

}
