package com.kodnest.patterns.level5;

public class Pattern1 {

	public static void main(String[] args) {
/*
1
22
333
4444
55555
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
	}
*/

/*
A
AA
AAA
AAAA
AAAAA
 
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
	    }
*/
		
/*
A
BB
CCC
DDDD
EEEEE
*/
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
	    }

	}
}
