package exercicios;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de numeros lidos: ");
        int n = sc.nextInt();
        int countIn = 0;
        int countOut = 0;
        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                countIn++;
            }
            else{
                countOut++;
            }
        }
        System.out.println(countIn + " in.");
        System.out.println(countOut + " out.");

        sc.close();
    }
}
