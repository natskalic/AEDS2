import java.util.Scanner;
import java.util.Random;
class Q2{

        public static void aleatorizar(String str,Random random){
                String strNova="";
		char letra1=(char)('a'+random.nextInt(26));
		char letra2=(char)('a'+random.nextInt(26));
                        for(int i=0;i<str.length();i++){
                                if(str.charAt(i)==letra2)
                                        strNova+=letra1;
                                else
                                        strNova+=str.charAt(i);
                        }
                                System.out.println(strNova);
        }

        public static void main(String[] args){
		Random random=new Random();
		random.setSeed(4);
                Scanner sc=new Scanner(System.in);
                String str=sc.nextLine();
                while(str.length()!=3 ||str.charAt(0)!='F' || str.charAt(1)!='I' || str.charAt(2)!='M'){
                        aleatorizar(str,random);
                        str=sc.nextLine();
                }
        }
}

