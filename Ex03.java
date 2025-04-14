package exercicios;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, gasolina, alcool, diesel;
        gasolina = 0;
        alcool = 0;
        diesel = 0;
        while (true) {
            System.out.println("Insira qual tipo de combustível [1.Álcool, 2.Gasolina, 3.Diesel, 4.Fim]");
            x = sc.nextInt();
            if (x == 1){
                alcool += 1;
            }
            else if (x == 2){
                gasolina += 1;
            }
            else if (x == 3){
                diesel += 1;
            }
            else if(x == 4){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Álcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
                sc.close();
                break;
            }

        }
    }
}
