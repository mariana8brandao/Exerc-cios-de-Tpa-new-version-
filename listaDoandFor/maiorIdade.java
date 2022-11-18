package listaDoandFor;
 import java.util.*;
public class maiorIdade {
	public static void main (String[]args) {
		double i=1+1, anoA,anoN,idade, rs;
		Scanner in= new Scanner(System.in);
		do {
			System.out.println("Insira o ano Atual");
			anoA=in.nextDouble();
			System.out.println("Insira seu ano de nascimento");
			anoN=in.nextDouble();
			idade=anoA-anoN;
			if(idade>18){
				System.out.println(idade+"O usuário é maior de idade");
			}else {
				System.out.println (idade+"O usuário é menor de idade");
			}
			System.out.println("Deseja executar o progama novamente?");
			rs=in.nextDouble();
			i++;
			
		}while (rs==1);
		System.out.println("obrigado por utilizar o progama!");
	}
}
