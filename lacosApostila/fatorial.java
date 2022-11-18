package lacosApostila;
import java.util.*;
public class fatorial {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int i=1,n;
		System.out.println("digite um numero inteiro");
		n= in.nextInt();
		do {
			n=n*(i-1);
			System.out.println(n);
			i++;
		}while(i>1);
	}
}
