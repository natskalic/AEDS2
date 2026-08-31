class Bubble extends Geracao{
	Bubble(int tam){
		super(tam);
	}
	public void sort(){
		int tam=array.length;
		for(int i=0;i<tam-1;i++){
			for(int j=0;j<tam-i-1;j++){
				if(array[j]>array[j+1])
					swap(j,j+1);
			}
		}	
	}
}
