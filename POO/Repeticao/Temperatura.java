package UNIMA.POO.Repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        char repetir;
        do{
        System.out.println("Digite a temperatura em Celsius: ");
        double temp = sc.nextDouble();
        double Formula = (9*temp)/5 + 32;
        System.out.printf("Equivalente em Fahreheit: %.1f", Formula);
        System.out.println("Deseja repetir? (s/n)");
        repetir = sc.next().toLowerCase().charAt(0);
        }while (repetir == 's');
        

        sc.close();
    }
}
