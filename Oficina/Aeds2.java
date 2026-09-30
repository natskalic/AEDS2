class Celula{
	int elemento;
	Celula sup,inf,esq,dir;
	Celula(int x){
		sup=inf=esq=dir=null;
		elemento=x;
	}
}

class Matriz{
	Celula inicio;
	int linhas,colunas;
	Matriz(int c,int l){
		int cont=1;
		linhas=l;
		colunas=c;
		inicio=new Celula(0);
		Celula i,col=inicio;
			for(int j=1;j<colunas;j++){
				col.dir=new Celula(cont++);
				col.dir.esq=col;
				col=col.dir;
		  	}
				i=inicio;
				for(int a=1;a<linhas;a++){
					i.inf=new Celula(cont++);
					i.inf.sup=i;
					i=i.inf;
					Celula atual=i.inf;
					Celula acima=i;
				for(int p=1;p<c;p++){
					atual.dir=new Celula(cont++);
					atual.dir.esq=atual;
					atual=atual.dir;
					acima=acima.dir;
					atual.sup=acima;
					atual.sup.inf=atual;
				}
				i=i.inf;
			}
	}
	void printZig(){
		Celula tmp=inicio;
		int inversor=1;
		for(int l=0;l<linhas;l++){
		while(tmp!=null && inversor==1){
			System.out.print(tmp.elemento+" ");
			tmp=tmp.dir;
			if(tmp.dir==null){
				inversor=-1;
			}
		}
		tmp=tmp.inf;
		System.out.print("\n");
		}
			while(tmp!=null && inversor==-1){
				System.out.println(tmp.elemento+" ");
				tmp=tmp.esq;
			if(tmp.esq==null){
				inversor=1;
			}
			}
			tmp=tmp.inf;
			System.out.print("\n");
		}
	void printEspelho(){
		Celula tmp=inicio;
		Celula col=tmp;
			while(tmp!=null){
				tmp=tmp.dir;
				if(tmp.dir==null){
					col=tmp;	
				}
			}
			
			for(int i=0;i<linhas;i++){
			
			Celula aux=col;
			while(aux!=null){
				System.out.print(aux.elemento+" ");
				aux=aux.esq;
			}
			System.out.print("\n");
			col=col.inf;
			aux=col;
		}
	}
}

class Aeds2{
	public static void main(String[] args){
		Matriz m=new Matriz(3,3);
		m.printZig();
		System.out.print("\n\n\n");
		m.printEspelho();

	}
}
