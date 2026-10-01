class Quick extends Geracao{
    Quick(int tam){
        super(tam);
    }
    public void sort(int esq, int dir){
        int i=esq,j=dir;
        int meio=(esq+dir)/2;
        while(i<=j){
            while(array[i]<array[meio]) i++;
            while(array[j]>array[meio]) j--;
            if(i<=j){swap(i,j);i++;j--;}
        }
        if(esq<j)sort(esq,j);
        if(dir>i)sort(i,dir);
    }

}