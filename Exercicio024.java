
import java.util.Scanner;

public class Exercicio024 {
    public static void main(String[] args) {
        
        String[] perguntas = new String[5];
        perguntas[0] = "A lua é um:\n" + "a) Planeta |\t| b)Estrela |\t| c) Satélite";
        perguntas[1] = "Walter White é o:\n" + "a) Breaking Bad |\t| b)Gus Frango |\t| c) Heisenberg";
        perguntas[2] = "Maria DB é um:\n" + "a) Linguagem de Programação |\t| b) Um SGBD |\t| c) Um nome muito estranho";
        perguntas[3] = "Capitão América lutou na:\n" + "a)1º Guerra |\t| b) 2º Guerra |\t| c) No Afanistão";
        perguntas[4] = "Cole McGrath é protgonista do jogo:\n" + "a) Dead Rising |\t|b) InFamous |\t| c) The Sims";

        //Gabarito:
        char[] gabarito = {'c', 'c', 'b', 'b', 'b'};

        char[] resposta = new char[5];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < perguntas.length; i++) {
            System.out.printf("\nQUESTÃO %d:\n", i+1);
            System.out.println(perguntas[i]);
            System.out.print("SUA RESPOSTA --> ");
            resposta[i] = input.nextLine().charAt(0);
        }
        
        input.close();

        int acertos = 0;
        //Verificando acertos:
        for(int i = 0; i < perguntas.length; i++) {
            if(resposta[i] == gabarito[i]) {
                acertos++;
            }
        }
        System.out.printf("\n\nACERTOU: %d Questões", acertos);

    }
}