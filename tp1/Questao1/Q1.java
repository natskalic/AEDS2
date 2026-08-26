import java.util.*;
class Q1{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		String texto=scanner.nextLine();
		while(!(texto.equals("FIM"))){
		String novoTexto="";	
			for(int i=0;i<texto.length();i++){
				novoTexto+=(char)(texto.charAt(i)+3);
			}
			System.out.println(novoTexto);
			texto=scanner.nextLine();
		}
	}
}


