package UNIMA.POO.Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        Integer numero = sc.nextInt();
        String res;

        if (numero < 0){
            res = "NEGATIVO";
        }
        else{
            res = "NÃO NEGATIVO";
        }
        
        System.out.println(res);
        sc.close();
    }
}
