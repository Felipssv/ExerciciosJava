package UNIMA.POO.Vetores.ProblemaExemplo.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alturas que deseja armazenar: ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double soma = 0;
        for (int i=0; i<n; i++){
            System.out.printf("Digite o valor da posição %d: ", i+1);
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        double media = soma/n;
        System.out.print(("Vetor = ["));
        for (int i=0; i<n; i++){
            System.out.print(vetor[i]); 
            if(i<n-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.printf("O valor da média das alturas é: %.2f.", media);

        sc.close();
    }
}
