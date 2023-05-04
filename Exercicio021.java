import java.util.Scanner;
public class Exercicio021 {
    public static void main(String[] args) {

        //Estrutura do SWITCH CASE(um pouco mais elaborado)
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1º valor --> ");
        float resp1 = input.nextFloat();

        System.out.print("Digite o 2º valor --> ");
        float resp2 = input.nextFloat();

        System.out.println("\nInforme a operação que deseja fazer:");
        System.out.println("SOMA: +\nSUBTRAÇÃO: -\nMULTIPLICAÇÃO: *\nDIVISÃO: /");
        System.out.print("SUA RESPOSTA --> ");
        char resp3 = input.next().charAt(0);

        input.close();

        //Estrutura do SWITCH
        switch(resp3) {
            case '+':
                System.out.printf("\n%.2f %c %.2f = %.2f", resp1, resp3, resp2, resp1+resp2);
                break;
                
            case '-':
                System.out.printf("\n%.2f %c %.2f = %.2f", resp1, resp3, resp2, resp1-resp2);
                break;

            case '*':
                System.out.printf("\n%.2f %c %.2f = %.2f", resp1, resp3, resp2, resp1*resp2);
                break;

            case '/':
                System.out.printf("\n%.2f %c %.2f = %.2f", resp1, resp3, resp2, resp1/resp2);
                break;

            default:
                System.out.println("\nOperação inválida, tente novamente");
        }

    }
}