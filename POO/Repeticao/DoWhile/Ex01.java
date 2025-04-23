package UNIMA.POO.Repeticao.DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int soma = 0, x = 0;
        
        do{
            System.out.println("Digite um valor: ");
            x = sc.nextInt();
            soma += x;
        }while(x !=0);
            System.out.println("A soma é: " + soma);
            sc.close();
        } 
    }
