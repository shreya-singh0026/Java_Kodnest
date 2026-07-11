#include<stdio.h>
int main(){
    int n=5;
    int i,k;
    for(i=n;i>=1;i--){
        for(k=1;k<=i;k++){
            printf("%d ",k);
        }printf("\n");
    }
}


/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/
