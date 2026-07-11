#include<stdio.h>
int main(){
    int n=10;
    for(int i=1;i<=n;i++){
//spaces
      for(int k=1;k<=n-i;k++){
            printf(" ");}
//printing stars
        for(int k=1;k<=2*i-1;k++){
            printf("*");}
            printf("\n");
    }
}
