#include<stdio.h>
int main(){
    int n=10;
    for(int i=n;i>=1;i--){
//spaces
      for(int k=1;k<=n-i;k++){
            printf(" ");}
//printing stars
        for(int k=1;k<=i;k++){
            printf("* ");}
            printf("\n");
    }
}
