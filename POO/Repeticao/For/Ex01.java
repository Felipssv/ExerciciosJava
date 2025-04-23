package UNIMA.POO.Repeticao.For;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        System.out.print("Até quanto quer contar? ");
        int x = sc.nextInt();

        for (int i=0; i<x; i++){
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println(soma);


        sc.close();
    }
}
