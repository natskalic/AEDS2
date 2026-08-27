#include <stdio.h>
char * ciframento(char * palavra, int i){
    if(palavra[i]=='\n') palavra[i]='\0';
    if(palavra[i]=='\0') return palavra;
    palavra[i]+=3;
    return(ciframento(palavra,i+1));
}


int main(){
    char palavra[50];
    fgets(palavra,50,stdin);
    while(palavra[0]!='F' && palavra[1]!='I' && palavra[2]!='M' && palavra[3]!='\0'){
    	ciframento(palavra,0);
   	printf("%s\n",palavra);
        fgets(palavra,50,stdin);
    }
}
