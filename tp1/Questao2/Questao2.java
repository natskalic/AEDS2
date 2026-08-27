import java.util.*;
class Questao2{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		String a=scanner.nextLine();
		String stringNova="";
		Random random= new Random();
		while(!a.equals("FIM")){
			int posicao=random.nextInt(a.length());
			char letra2=(char)('a'+ random.nextInt(26));
			for(int i=0;i<a.length();i++){
				if(a.charAt(i)==a.charAt(posicao))
				stringNova+=letra2;
				else
				stringNova+=a.charAt(i);
			}
			System.out.println(stringNova);
			a=scanner.nextLine();
			stringNova="";
		}
	}
}



			
