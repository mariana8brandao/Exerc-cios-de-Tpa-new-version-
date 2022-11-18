package listaClassicos;
import java.util.*;
public class fibonacci {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int posicao=1,ant=0,atual=1,prox,termo;
		System.out.println("Digite o número ( até a onde o série de Fibonacci deve aparecer)");
		termo=in.nextInt();
		do {
			prox=ant+atual;
			ant=atual;
			atual=prox;
			System.out.println(+atual);
			posicao++;
		}while(posicao<termo);
	}
}
