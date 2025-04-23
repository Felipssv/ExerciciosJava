package UNIMA.POO.SwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o dia da semana: ");
        int x = sc.nextInt();
        String dia = null;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-Feira";
                break;
            case 3:
                dia = "Terça-Feira";
                break;
            case 4:
                dia = "Quarta-Feira";
                break;
            case 5:
                dia = "Quinta-Feira";
                break;
            case 6:
                dia = "Sexta-Feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }
        System.out.println("Dia: " + dia);


        sc.close();
    }
}
