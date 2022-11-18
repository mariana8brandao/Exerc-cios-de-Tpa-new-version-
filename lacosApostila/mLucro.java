package lacosApostila;
import java.util.*;
public class mLucro {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int i=1+1;
		double precoP,precoV, margemLi, lucro, rs;
		
		do {
			System.out.println("Digite o preço do produto");
			precoP= in.nextDouble();
			System.out.println("Digite a margem de lucro em porcentagem");
			margemLi= in.nextDouble();
			lucro=(precoP*margemLi)/100;
			precoV= lucro+precoP;
			System.out.println("o preço da venda é"+precoV);
			System.out.println(" deseja continuar o progama digite 1 para sim e 2 para não");
			rs= in.nextDouble();
			i++;
		}while(rs==1);
		System.out.println("obrigado por usar o proggrama! kisses");
		
	}

}
