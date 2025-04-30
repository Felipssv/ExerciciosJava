package UNIMA.POO.AtividadeVetores.MaiorPosicao.src;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posMaior;
	    double maior;

	    System.out.print("Quantos numeros voce vai digitar? ");
	    n = sc.nextInt();

	    double[] vect = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vect[i] = sc.nextDouble();
	    }

	    maior = vect[0];
	    posMaior = 0;

	    for (int i=1; i<n; i++) {
	        if (vect[i] > maior) {
	            maior = vect[i];
	            posMaior = i;
	        }
	    }
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);

		sc.close();
	}
}