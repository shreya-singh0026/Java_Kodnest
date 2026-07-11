#include<stdio.h>
int main(){  //NOR WORKING 
	int n=10;
	int i,j,k,m;
	for(i=1;i<=n;i++){       
		for(j=1;j<=n-i;j++)printf(" ");
		for(k=1;k<=1;k++)printf("*");printf("\n");
		for(m=2;m<=2*i+1;m++)printf(" ");
		for(n=1;n<=1;n++)printf("*");printf("\n");
	}
    for(i=n;i>=1;i--){   
		for(j=1;j<=n-i;j++)printf(" ");
		for(k=1;k<=1;k++)printf("*");printf("\n");
		for(m=2;m<=2*i+1;m++)printf(" ");
		for(n=1;n<=1;n++)printf("*");printf("\n");
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
