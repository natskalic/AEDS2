#include  <stdio.h>

int soma(int n){
        int valor=n;
        int resp=0;
        while(valor!=0){
                resp+=(valor%10);
                valor=(valor/10);
        }
        return resp;
}

int main(){
        int n;
        while((scanf("%d",&n))!=EOF){
                printf("%d",soma(n));
                printf("\n");
        }
}
