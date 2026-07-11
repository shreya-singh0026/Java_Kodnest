#include<stdio.h>
int main(){
int n =7;
int i,j,k;
for(i=1;i<=n;i++){
	for(j=1;j<=n-i;j++) printf("   ");
	for(k=1;k<=5;k++)printf(" * ");
	printf("\n");
}
}

/*
                   *  *  *  *  *
                *  *  *  *  *
             *  *  *  *  *
          *  *  *  *  *
       *  *  *  *  *
    *  *  *  *  *
 *  *  *  *  *
 */
