#include <stdio.h>
void ordenacao(char * string,int tam){
	for(int i=0;i<tam-1;i++){
		int menor=i;
		for(int j=i+1;j<tam;j++){
			if(string[j]<=string[menor])
				menor=j;	
		}
		char tmp=string[i];
		string[i]=string[menor];
		string[menor]=tmp;
		
	}

}

void lowerCase(char *string,int tam){
	for(int i=0;i<tam;i++){
		if(string[i]>='A' && string[i]<='Z')
			string[i]+=32;
	}
}

int tamanho(char *string){
	int tam=0;
	while(string[tam]!='\0') tam++;
	return tam;
}

int main(){
	char string1[100],string2[100];
	int tam1,tam2;
	scanf("%s",string1);
	tam1=tamanho(string1);
	int anagrama;
	while(!(string1[0]=='F' &&  string1[1]=='I' && string1[2]=='M' && string1[3]=='\0')){
		scanf("%s",string2);
		tam2=tamanho(string2);
		if(tam1!=tam2) printf("NAO\n");
		else{
			lowerCase(string1,tam1);
			lowerCase(string2,tam2);
			ordenacao(string1,tam1);
			ordenacao(string2,tam2);
			anagrama=1;
			for(int i=0;i<tam1;i++){
				if(string1[i]!=string2[i]){
					printf("NAO\n");
					anagrama=0;
					break;
				}
			}
				if(anagrama==1) printf("SIM\n");
			
		}
				scanf("%s",string1);
				tam1=tamanho(string1);
	}
}
		
