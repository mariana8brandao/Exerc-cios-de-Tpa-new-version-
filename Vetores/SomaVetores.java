package Vetores;
import java.util.*;
public class SomaVetores {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		final int TAM= 4;
		int a[], b[],c[],i;
		
		a= new int [TAM];
		b= 	new int [TAM];
		c= new int [TAM];
		for(i=0; i<TAM; i++){
			System.out.println("digite o"+(i+1)+ "numero");
			a[i]= in.nextInt();
		}
			for(i=0; i<TAM; i++){
			System.out.println("Digite o"+(i+1)+ "numero");
			b[i]= in.nextInt();
			}
			for(i=0; i<TAM; i++){
			c[i]=a[i]+b[i];
			System.out.print("A soma é"+c[i]);
			
		}
	}
}
