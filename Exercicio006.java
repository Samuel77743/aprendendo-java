/**
 * Exercicio006
 */
import java.util.Scanner;

 public class Exercicio006 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número --> ");
        int n1 = teclado.nextInt();

        System.out.print("Digite o segundo número --> ");
        int n2 = teclado.nextInt();

        int resposta = n1+n2;
        System.out.printf("\nA soma de %d + %d = %d", n1, n2, resposta);


    }
 }