package exercicios;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha;

        while(true){
            System.out.print("Insira a senha: ");
            senha = sc.nextInt();
            if(senha == 2002){
            System.out.println("Acesso Permitido!");
            sc.close();
            break;
        }
        System.out.println("Senha inválida!");
        
    }
    }
}
