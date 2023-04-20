/**
 * Exercicio008
 */

import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args) {
        int count = 1;
        while(count <= 5){
            System.out.printf("%d\n", count);
            count++;
        }
        Scanner input = new Scanner(System.in);
        int resposta = 0;

        //Com o "do" o bloco de comando será compilado independente da condição do while.
        do{ 
            System.out.print("Digite 19 ou permanecerá em loop\nSUA RESPOSTA --> ");
            resposta = input.nextInt();
        }while(resposta != 19);

        input.close();

        System.out.print("\n---FIM DO PROGRAMA---\n\n");
    }
}