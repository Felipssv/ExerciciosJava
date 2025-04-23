package UNIMA.POO.Repeticao.While;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int x = sc.nextInt();
        int soma = 0;
        while(x!=0){
            soma += x;
            System.out.println("Digite um valor: ");
            x = sc.nextInt();
        }

        System.out.println("A soma é " + soma);
        sc.close();



        
    }
}
