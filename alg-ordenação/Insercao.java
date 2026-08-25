class Insercao extends Geracao{
	Insercao(int tam){
		super(tam);
	}
	public void sort(){
		int tmp;
		int j;
		for(int i=1;i<array.length;i++){
			tmp=array[i];
			j=i-1;
			while(j>=0 && tmp<=array[j]){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=tmp;
		}
	}
}

