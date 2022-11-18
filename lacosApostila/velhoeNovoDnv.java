package lacosApostila;
import java.util.*;
public class velhoeNovoDnv {
	public static void main(String[]args) {
		Scanner in= new Scanner (System.in);
		int  i=1,idade,  velho=0, novo=1000;
		char nome;
		do {
			System.out.println("Digite sua idade");
			idade=in.nextInt();
			System.out.println("Digite seu nome");
			nome=in.nextChar();
			if(idade>velho){
				velho=idade;
			}
			if(idade<novo){
				novo=idade;
			}
			i++;
		}while(i<=10);
		System.out.println("o mais velho é"+nome+ "com "+velho+"anos");
		System.out.println("o mais novo é"+nome+"com"+novo+ "anos");
		
		
		
	}

}
