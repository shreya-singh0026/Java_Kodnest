#include<stdio.h>
int main(){
    int n=10;
    for(int i=1;i<=n;i++){
        for(int k=1;k<=n+1-i;k++){
            printf("*");
        }printf("\n");
    }
}
