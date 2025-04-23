package UNIMA.POO.Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite dois numeros inteiros: ");
        Integer numero = sc.nextInt();
        Integer numero2 = sc.nextInt();
        String res;


        if (numero % numero2 == 0 || numero2 % numero == 0 ){
            res = "MÚTIPLOS";
        }
        else {
            res = "NÃO SÃO MÚTIPLOS";
        }
        System.out.println(res);

        sc.close();
    }
}
