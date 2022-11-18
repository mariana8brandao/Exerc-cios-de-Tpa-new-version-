package listaClassicos;
import java.util.*;
public class numeroPrimo {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Digite um número inteiro");
		n=in.nextInt();
		if(n%2==1){
		    System.out.println("E um número primo");
		}else {
			System.out.println("nao é um número primo");
		}
	}

}
