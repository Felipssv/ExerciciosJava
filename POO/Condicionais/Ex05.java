package UNIMA.POO.Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Insira um valor:");
        double valor = sc.nextDouble();
        String res;

        if (valor >= 0.0 && valor <= 25.0) {
            res = "INTERVALO [0, 25]";
        }
        else if(valor > 25.0 && valor <= 50.0 ){
            res = "INTERVALO [25, 50]";
        }
        else if(valor > 50.0 &&valor <= 75.0){
            res = "INTERVALO [50, 75]";
        }
        else if(valor > 75.0 && valor <= 100.0){
            res = "INTERVALO [75, 100]";
        }
        else{
            res = "Fora de intervalo";
        }
        System.out.println(res);

        sc.close();
    }
}
