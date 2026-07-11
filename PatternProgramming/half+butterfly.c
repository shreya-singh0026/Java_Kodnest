#include<stdio.h>
int main(){
	int n=5;
	int i,j,k,l;
	for(i=1;i<=n;i++){
		for(j=1;j<=i;j++) printf(" * ");
		for(k=1;k<=2*(n-i);k++) printf("   ");
		for(l=1;l<=i;l++) printf(" * ");
	printf("\n");	
	}
}


/*
 *                          *
 *  *                    *  *
 *  *  *              *  *  *
 *  *  *  *        *  *  *  *
 *  *  *  *  *  *  *  *  *  *
 
 */
 /*
 row      *       spaces               *  
 1        1         8                  1
 2        2         6                  2
 3        3         4                  3
 4        4         2                  4
 5        5         0                  5
(1 to n)  ( 1to i)  (1 to 2*(n-i)   (1to i) 

