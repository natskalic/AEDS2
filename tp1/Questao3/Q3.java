import java.util.*;

class Q3{
	public static void main(String[] args){
		String string;
		Scanner scanner= new Scanner(System.in);
		string=scanner.nextLine();
		while(!(string.equals("FIM"))){
			System.out.println(vogais(string)+" "+consoantes(string)+" "+ inteiro(string)+" "+ehReal(string));
			string=scanner.nextLine();
		}
	}
	public static boolean ehPalavra(String string){
		for(int i=0;i<string.length();i++){
			if(!((string.charAt(i)>='A' && string.charAt(i)<='Z') || (string.charAt(i)>='a' && string.charAt(i)<='z'))){
				return false;	
			}
		}
	return true;
	}
	public static boolean vogais(String string){
		if(ehPalavra(string)==true){
		for(int i=0;i<string.length();i++){
			if(!(string.charAt(i)=='A' || string.charAt(i) =='E' || string.charAt(i)=='I' || string.charAt(i)=='O' || string.charAt(i)=='U' || 
			     string.charAt(i)=='a' || string.charAt(i) =='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u')){
					return false;
			}
		}
		return true;
		}
		return false;
	}

	public static boolean consoantes(String string){
		if(ehPalavra(string)==true){
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)=='A' || string.charAt(i) =='E' || string.charAt(i)=='I' || string.charAt(i)=='O' || string.charAt(i)=='U' || 
			     string.charAt(i)=='a' || string.charAt(i) =='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u'){
					return false;
			}
		}
		return true;
		}
		return false;
	}

	public static boolean inteiro(String string){
		for(int i=0;i<string.length();i++){
			if(!(string.charAt(i)>=48 && string.charAt(i)<=57)){
				return false;
			}
		}
		return true;
	}


	public static int contarSeparador(String string){
		int separador=0;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)=='.' || string.charAt(i)==',') separador++;
		}
		return separador;
	}
	public static boolean ehNumero(String string){
		if((contarSeparador(string))<=1){
			for(int i=0;i<string.length();i++){
				if(!(string.charAt(i)>=48 && string.charAt(i)<=57 || string.charAt(i)=='.' || string.charAt(i)==',')){
					return false;
				}
			}
		}
		return true;
	}

	public static boolean ehReal(String string){
		if(ehNumero(string)==true && contarSeparador(string)==1 && string.charAt(0)!='.' && string.charAt(0)!=',' && string.charAt(string.length()-1)!='.' &&string.charAt(string.length()-1)!=',') return true;
		return false;	
}
}





