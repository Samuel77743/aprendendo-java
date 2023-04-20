/**
 * Exercicio011
 */
import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] gabarito = {'a', 'a', 'd', 'b', 'c'};
        final int tam = gabarito.length;

        char[] resposta = new char[tam];
        
        for(int contador = 0; contador < tam; contador++){
            System.out.printf("Responda aa %dº questão --> ", contador+1 );
            resposta[contador] = input.next().charAt(0);
        }
        
        int pontuacao = 0;
        for(int i = 0; i < tam; i++){
            if(gabarito[i] == resposta[i]){
                pontuacao++;
            }
        }

        System.out.println("Número de acertos --> "+pontuacao);

    }
}