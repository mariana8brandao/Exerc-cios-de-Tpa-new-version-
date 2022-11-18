package lacosApostila;

import java.util.Scanner;

public class descInss {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		double desc, s, sdesc;
		int i=1;
		do {
			System.out.println("Digite o salário e saiba o desconto do INSS");
			s=in.nextDouble();
			if(s<2000) {
				desc=(s*8.5)/100;
				sdesc=s-desc;
				System.out.println("O desconto é de "+desc+ "deixando o salário inicial = a"+sdesc);
			}else {
				desc=(s*11)/100;
				sdesc=s-desc;
				System.out.println("O desconto é de "+desc+ "deixando o salário inicial = a"+sdesc);
				i++;
			}
		}while(i<4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
