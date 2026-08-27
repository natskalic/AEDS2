#include <stdio.h>

void funcao(char *string, int tam){
	int cont=1, maior = 0,j,k,encontrou=0;
	for(int i = 0; i < tam; i++){
		j=i+1;
		cont=1;
		encontrou=0;
		while(j<tam && encontrou==0){
			k=i;
			while(k<j){
				if(string[j]==string[k]) encontrou=1;
				k++;
			}
			if(encontrou==0){
			       	j++;
				cont++;
			}
		}
		if(cont > maior){
			maior = cont;
		}
	}
	printf("%d\n",maior);
}

int tamanho(char*string){
	int tam=0;
	while(string[tam]!='\0') tam++;
	return tam;
}
int main(){
	char string[100];int tam=0;
	scanf("%s",string);
	tam=tamanho(string);
	while(string[0]!='F' && string[1]!='I' && string[2]!='M' && string[3]!='\0'){
	funcao(string, tam);
	scanf("%s",string);
	tam=tamanho(string);
	}
}
