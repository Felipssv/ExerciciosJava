package UNIMA.POO.AtividadeVetores.Negativos.src;

import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números vc vai digitar? ");
        int num = sc.nextInt();
        int[] vect = new int[num];

        for (int i=0; i<num; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i=0; i<vect.length; i++){
            if(vect[i] <0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
