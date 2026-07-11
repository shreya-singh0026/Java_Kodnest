#include<stdio.h>
int main(){
    int n=10;
    int i,k,j;
    for(i=1;i<=n;i++){
//spaces
      for( k=1;k<=n-i;k++){
            printf(" ");}
//printing stars
        for(j=1;j<=i;j++){
           printf("* ");}
            printf("\n");
    }
}

/*
         *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *
   * * * * * * *
  * * * * * * * *
 * * * * * * * * *
* * * * * * * * * *

*/
