#include <stdio.h>
#include <string.h>

typedef struct{
	int ano;
	int mes;
	int dia;
}Data;

Data parseData(char * s){
	int dia,mes,ano;
	char *split;
	char copia[10];
	strcpy(copia,s);
	Data d;
	sscanf(s,"%d-%d-%d",&d.ano,&d.mes,&d.dia);
	return d;
}
void formatData(Data d){
	printf("%02d/%02d/%02d",d.dia,d.mes,d.ano);
}


typedef struct{
	int id;
	char *marca;
	char *modelo;
	int ano;
	char *categoria;
	char[][] combustivel;
	int cilindro;
	double cilindrada;
	char *transmissao;
	char *tracao;
	double consumoCidade;
	double consumoEstrada;
	double co2;
	int turbo;
	Data dataRegistro;
}

Veiculo parseVeiculo(char *s){
	Veiculo v;
	char *turbo_s[50],combustivel[50],dataRegistro[20];
	sscanf(linha, "%d,%[^,],%[^,],%d,%[^,],%[^,],%d,%f,%[^,],%[^,],%f,%f,%f,%[^,],%s",
         &v.id,
         v.marca,
         v.modelo,
         &v.ano,
         v.categoria,
         combustivel_str,
         &v.cilindro,
         &v.cilindrada,
         v.transmissao,
         v.tracao,
         &v.consumoCidade,
         &v.consumoEstrada,
         &v.co2,
         turbo_str,
         data_str);

	if(strcmp(turbo_str,"true")) v.turbo=1;
	else v.turbo=0;
	strcpy(v.combustivel,combustivel_str);
	v.dataRegistro=parseData(dataRegistro);
}

void formatVeiculo(Veiculo v){
	printf("[%d ## %s ## %s ## %d ## %s ## %s ## %d ## %d ## %.2f ## %s ## %s ## %2.f ## %.2f ## %.2f ## %s]",
	 v.modelo, 
         v.ano, 
         v.categoria,
         v.combustivel, 
         v.cilindro, 
         v.cilindrada,
         v.transmissao, 
         v.tracao, 
         v.consumoCidade,
         v.consumoEstrada, 
         v.co2, 
         v.turbo ? "true" : "false");
	 formatData(v.dataRegistro);
	 printf("\n");
}

Leitor(char *caminho){
	File *file=fopen(caminho,"r");
	char carros[501];


}





