package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de testes: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.print("Digite os três números: ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            double mediaP = ((x *2) + (y * 3) + (z * 5))/10;
            System.out.printf("Média: %.1f\n", mediaP);
        }
        

        sc.close();
    }
}
