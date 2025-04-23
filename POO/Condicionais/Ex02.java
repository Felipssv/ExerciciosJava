package UNIMA.POO.Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        Integer numero = sc.nextInt();
        String res;

        if (numero % 2 == 0){
            res = "PAR";
        }
        else{
            res = "ÍMPAR";
        }

        System.out.println(res);


        sc.close();
    }
}