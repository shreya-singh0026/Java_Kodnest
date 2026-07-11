#include<stdio.h>
int main(){
	int n=6;
	int i,j,k;
	for(i=1;i<=n;i++){       //upper traingle
		for(j=1;j<=n-i;j++)printf(" ");
		for(k=1;k<=2*i-1;k++)printf("*");printf("\n");
	}
    for(i=n;i>=1;i--){   //lower traingle
		for(j=1;j<=n-i;j++)printf(" ");
		for(k=1;k<=2*i-1;k++)printf("*");printf("\n");
	}
}

/*

     *
    ***
   *****
  *******
 *********
***********
***********
 *********
  *******
   *****
    ***
     *
*/

/*
row         spaces      *   //upper part
1             5         1
2             4         2
3             3         3
4             2         4
5             1         5
6             0         6






*/
