package UNIMA.POO.AtividadeVetores.NumerosPares.src;

import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i=0; i<n; i++){
            vect[i] = sc.nextInt();
        }
        System.out.println("NÚMEROS PARES: ");
        int qtdPares = 0;

        for(int i=0; i<n; i++){
            if(vect[i] % 2 == 0){
                System.out.printf("%d ", vect[i]);
                qtdPares++;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES = " + qtdPares);

        sc.close();
    }
   
}
