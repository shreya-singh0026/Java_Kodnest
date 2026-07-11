#include<stdio.h>
int main(){
    int n=5;
    int i,k;
    for(i=1;i<=n;i++){
        for(k=1;k<=i;k++){
        if((i+k)%2==0)
            printf("1 ");
        else
        printf("0 ");
        }printf("\n");
    }
}

/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/
