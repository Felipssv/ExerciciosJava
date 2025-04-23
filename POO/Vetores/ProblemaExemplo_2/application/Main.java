package UNIMA.POO.Vetores.ProblemaExemplo_2.application;

import java.util.Locale;
import java.util.Scanner;

import UNIMA.POO.Vetores.ProblemaExemplo_2.entities.Produto;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Insira a quantidade de produtos: ");
        int n = sc.nextInt();
        String nome;
        double preco;
        Produto[] produto = new Produto[n];

        double soma = 0.0;
        for (int i=0; i<n ; i++){
            System.out.printf("Insira o nome do produto %d: ", i+1);
            nome = sc.nextLine();
            sc.nextLine();
            System.out.printf("Insira o preço do produto %d: ", i+1);
            preco = sc.nextDouble();
            produto[i] = new Produto(nome, preco);
        }
        for (int i=0; i<n; i++){
            soma += produto[i].getPrice();
        }
        double media = soma / n;
        System.out.printf("Valor total da compra: $%.2f", soma);
        System.out.printf("\nValor médio da compra: $%.2f", media);
        
        sc.close();
    }
}
