package exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;

        while (true) {
            System.out.print("Insira as coordenadas: ");
            x = sc.nextInt();
            y = sc.nextInt();

            if (x>0 && y>0){
                System.out.println("Primeiro quadrante.");
            }
            else if(x>0 && y<0){
                System.out.println("Quarto quadrante.");
            }
            else if(x<0 && y>0){
                System.out.println("Segundo quadrante.");
            }
            else if(x<0 && y<0){
                System.out.println("Terceiro quadrante.");
            }
            else{
                sc.close();
                break;
            }
        }
    }
}
