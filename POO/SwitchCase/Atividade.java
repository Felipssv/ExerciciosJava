package UNIMA.POO.SwitchCase;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do professor: ");
        String x = sc.nextLine();
        String materia = null;
        switch (x) {
            case "Cesar":
                materia = "da disciplina de Sistemas Digitais";
                break;
            case "Victor Bruno":
                materia = "da disciplina de Projeto de Programação";
                break;
            case "Lucyo":
                materia = "da disciplina de Cálculo 2";
                break;
            case "Adriana":
                materia = "da disciplina de Estatística Computacional";
                break;
            default:
                materia = "Não está na grade atual";
                break;
        }
        System.out.printf("O(a) professor(a) %s, %s.",x ,materia);


        sc.close();
    }
}
