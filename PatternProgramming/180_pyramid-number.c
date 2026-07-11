#include<stdio.h>
int main(){
    int n=9;
    int i,j,k;
    for(i=1;i<=n;i++){
//spaces
      for(k=1;k<=n-i;k++){
            printf(" ");}
//printing stars
        for(j=i;j>=1;j--){
            printf("%d",j);}

            printf("\n");
    }
}

/*
        1
       21
      321
     4321
    54321
   654321
  7654321
 87654321
987654321
*/






