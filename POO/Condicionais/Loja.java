package UNIMA.POO.Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double preco = sc.nextDouble();

        /*
        if(preco < 20){
            preco *= 0.9; // 10% desconto
        } else {
            preco *= 0.85; // 15% desconto
        }
         */
        double x =(preco < 20) ? (preco *= 0.9):(preco *= 0.85);

        System.out.printf("Preço final %.2f", x);



        sc.close();
    }
}
