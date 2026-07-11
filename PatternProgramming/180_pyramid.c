#include<stdio.h>
int main(){
    int n=10;
    int i,j,k;
    for(i=1;i<=n;i++){
 //spaces
   	for(k=1;k<=n-i;k++){
            printf(" ");}
//stars
        for(k=1;k<=i;k++){
            printf("*"); }
		printf("\n");
    }
}

/*
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********

*/

