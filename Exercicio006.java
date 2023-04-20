/**
 * Exercicio006
 * Códigos bases para poder fazer entrada de dados:
 * 1º -> import java.util.Scanner;
 * 2º -> Scanner <nome> = new Scanner(System.in);
 * 3º -> <tipo> <nome_variavel> = <nome>.next<tipo>();
 */
import java.util.Scanner;

 public class Exercicio006 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno --> ");
        String nome = teclado.nextLine();

        System.out.print("Digite a nota da primeira prova --> ");
        float nota1 = teclado.nextFloat();

        System.out.print("Digite a nota da segunda prova --> ");
        float nota2 = teclado.nextFloat();

        System.out.print("Digite a nota da terceira prova --> ");
        float nota3 = teclado.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("\nNOTA DE %s:\nPROVA 1: %.2f\nPROVA 2: %.2f\nPROVA 3: %.2f", nome, nota1, nota2, nota3);
        System.out.printf("\n\nMÉDIA ALCANÇADA --> %.2f", media);

        final float mediaMin = 6; //Definindo constante

        String situacao = (media >= mediaMin ? "Aprovado" : "Reprovado");
        System.out.println("\nSituação: " + situacao);

        teclado.close(); //Fechar entrada de dados
    }
 }