#include<stdio.h>
int main(){
    int n=5;
    int i,k,sum=0;
    for(i=1;i<=n;i++){
        for(k=1;k<=i;k++){
        	sum=sum+1;
            printf("%d  ",sum);
        }printf("\n");
    }
}

/*
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
*/
