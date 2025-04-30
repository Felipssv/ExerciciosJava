package UNIMA.POO.AtividadeVetores.SomaVetor.src;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double soma, media;
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        soma = 0;
        for (int i=0; i<vect.length; i++){
            soma += vect[i];
        }

        media = soma / n;

        System.out.print("VALORES = ");

        for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vect[i]);
	    }

	    System.out.printf("\nSOMA = %.2f\n", soma);
	    System.out.printf("MEDIA = %.2f\n", media);


        sc.close();
    }
}
