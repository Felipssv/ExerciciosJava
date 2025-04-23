package UNIMA.POO.Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a hora inicial e final de um jogo: ");
        Integer horaInicial = sc.nextInt();
        Integer horaFinal = sc.nextInt();
        String res;

        if (horaFinal > horaInicial){
            int horaTotal = horaFinal - horaInicial;
            res = String.format("O JOGO DUROU %d HORAS", horaTotal);
        }
        else{
            int horaTotal = 24 - (horaInicial - horaFinal);
            res = String.format("O JOGO DUROU %d HORAS", horaTotal);
        }

        System.out.println(res);

        sc.close();
    }
}
