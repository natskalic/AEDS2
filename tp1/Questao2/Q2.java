import java.util.*;
class Q2{

	public static void funcao(String frase){
		Random random= new Random();
		String stringNova="";
		int posicao=random.nextInt(frase.length());
		char letra2=(char)('a'+ random.nextInt(26));
			for(int i=0;i<frase.length();i++){
				if(frase.charAt(i)==frase.charAt(posicao))
				stringNova+=letra2;
				else
				stringNova+=frase.charAt(i);
			}
			System.out.println(stringNova);
	}

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String frase=scanner.nextLine();
		while(!frase.equals("FIM")){
			funcao(frase);
			frase=scanner.nextLine();
		}
	}
}



			
