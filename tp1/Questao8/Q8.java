import java.util.Scanner;


public static int numero(char c){
	if(c>='0' && c<='9') return 1;
	return 0;
}

public static int minuscula(char c){
	if(c>='a' && c<='z') return 1;
	return 0;
}

public static int maiuscula(char c){
	if(c>='A' && c<='Z') return 1;
	return 0;
}

public static int especial(char c){
	if(numero(c)==0 && minuscula(c)==0 && maiuscula(c)==0) return 1;
	return 0;
}

public static boolean validacaoSenha(String string){
		int numeros=0,maiusculas=0,minusculas=0,especiais=0;
		for(int i=0;i<string.length();i++){
			if(numero(string.charAt(i))==1) numeros++;
			if(minuscula(string.charAt(i))==1) minusculas++;
			if(maiuscula(string.charAt(i))==1) maiusculas++;
			if(especial(string.charAt(i))==1) especiais++;
		}
		if(string.length()>=8 && numeros>=1 && maiusculas>=1 && minusculas>=1 && especiais>=1) return true;
		return false;
}

public static void main(String[] args){
	Scanner scanner= new Scanner(System.in);
	String string=scanner.nextLine();
	while(!string.equals("FIM")){
		if(validacaoSenha(string)==true) System.out.println("SIM");
		else System.out.println("NAO");
		string=scanner.nextLine();
	}
}






