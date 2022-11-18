package listaClassicos;
import java.util.*;
public class mediaPessoas {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		double idade, velho=0, novo=0, somaI=0,m=0;
		int i=1;
		for( i=1;i<=3;i++) {
			System.out.println("Digite sua idade ");
			idade = in.nextInt();
			somaI+=idade;
			if(idade > velho) {
				velho = idade;
			}
			
			if(idade < novo || i==1) {
				novo = idade;
			}
			
			
		}
		m=somaI/3;
		System.out.println("A idade mais nova é: "+ velho+"A idade mais nova é: "+novo +"A média das idades é: "+m);
	}
}
