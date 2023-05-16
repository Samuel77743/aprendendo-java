import java.util.Scanner;

public class Exercicio035 {
    public static void main(String[] args) {
        //Usando Throw: uma interrupão programada

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do aluno --> ");
        float resp = input.nextFloat();

        input.close();

        //No caso de uma nota inválida programa será interrompido com uma excessão e msg 
        if(resp > 100 || resp < 0) {
            throw new IllegalArgumentException("Valor de nota inválida");
        }

        else {
            System.out.println("Nota registrada com sucesso");
        }
    }
}
