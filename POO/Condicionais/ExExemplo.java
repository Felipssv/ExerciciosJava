package UNIMA.POO.Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExExemplo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos minutos você falou no telefone? ");
        int x = sc.nextInt();
        double res = 0;
        
        if(x<=100){
            res = 50.0;
        }else{
            res = (x - 100) * 2;
            res += 50;
        }
        System.out.println("A quantia que se deve pagar é: R$" + res);

        sc.close();
    }
}
