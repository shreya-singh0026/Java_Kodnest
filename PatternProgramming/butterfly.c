#include<stdio.h>
int main(){
	int n=5;
	int i,j,k,l,i1,j1,k1,l1;
	for(i=1;i<=n;i++){
		for(j=1;j<=i;j++) printf(" * "); //stars
		for(k=1;k<=2*(n-i);k++) printf("   ");//spaces
		for(l=1;l<=i;l++) printf(" * ");//stars
	printf("\n");	}
	for(i1=n;i1>=1;i1--){
		for(j1=1;j1<=i1;j1++) printf(" * ");//stars
		for(k1=1;k1<=2*(n-i1);k1++) printf("   ");//spaces
		for(l1=1;l1<=i1;l1++) printf(" * ");//stars
		printf("\n");}
}


/*

 *                          *
 *  *                    *  *
 *  *  *              *  *  *
 *  *  *  *        *  *  *  *
 *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *
 *  *  *  *        *  *  *  *
 *  *  *              *  *  *
 *  *                    *  *
 *                          *

 
 */
 /* for upper part
 row      *       spaces               *  
 1        1         8                  1
 2        2         6                  2
 3        3         4                  3
 4        4         2                  4
 5        5         0                  5
(1 to n)  ( 1to i)  (1 to 2*(n-i)   (1to i) 
*/
