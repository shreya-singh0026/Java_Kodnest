#include<stdio.h>
int main(){
    int n=10;
    for(int i=n;i>=1;i--){
        for(int k=1;k<=i;k++){
            printf("*");
        }printf("\n");
    }
}
