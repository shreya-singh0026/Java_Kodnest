#include<stdio.h>
int main(){
    int n=9;
    int i,j,k;
    for(i=1;i<=n;i++){
//spaces
      for(k=1;k<=n-i;k++){
            printf(" ");}
//printing half part stars
        for(j=i;j>=1;j--){
            printf("%d",j);}
//printing other halfstars
        for(j=2;j<=i;j++){
            printf("%d",j);}
            
            printf("\n");
    }
}



/*
                1
              2 1 2 
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5 
      6 5 4 3 2 1 2 3 4 5 6
    7 6 5 4 3 2 1 2 3 4 5 6 7 
  8 7 6 5 4 3 2 1 2 3 4 5 6 7 8
9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9 

*/
