package UNIMA.POO.ME1UP.Atividade_1.Questao_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.printf("AREA = %.2f\n" , rectangle.Area());
        System.out.printf("PERIMETER = %.2f\n" , rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f" , rectangle.Diagonal());

        sc.close();
    }
}
