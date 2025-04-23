package UNIMA.POO.ME1UP.Atividade_1.Questao_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross Salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.printf("Employee: %s, $ %.2f", name, employee.netSalary());
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        System.out.printf("Updated data: %s, $ %.2f", name, employee.increaseSalary(percentage));

        sc.close();
    }
}
