#include<stdio.h>
int main(){
    int n=10;
    int i,k;
    for(i=1;i<=n;i++){
        for(k=1;k<=i;k++){
            printf("%d",k);
        }printf("\n");
    }
}

/*
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
*/
