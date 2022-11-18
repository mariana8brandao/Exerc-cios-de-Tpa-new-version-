package listaClassicos;
import java.util.Scanner;
public class tabuadaLaco {
	public class descInss {
		public static void main (String[]args) {
			Scanner in = new Scanner(System.in);
			int i,rs,n;
			System.out.println("Digite um numero inteiro");
			n=in.nextInt();
			for(i=1;i<=10;i++) {
				rs=n*i;
				System.out.println(n+"x"+i+"+"+rs);
			}
			
		}
		}			
}


