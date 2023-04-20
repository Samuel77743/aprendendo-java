public class Exercicio003 {
    public static void main(String[] args){
        //Estruturas de Decisão

        System.out.println("\n-------MÉDIA DE NOTAS-------");
        System.out.println("Média mínima para aprovação--> 6");
        float nota1 = 6;
        float nota2 = 5;

        float media = (nota1 + nota2) / 2;
        
        int maxfalta = 5, frequencia = 10;

        System.out.printf("\nNota alcançada --> %.2f\n", media);

        if(frequencia <= maxfalta){
            if(media >= 6){
                System.out.println("Aprovado\n\n");
            }   
            else if(media >= 4){
            System.out.println("Recuperação");
            }
            else{
                System.out.print("Reprovado\n\n");
        }
        }
        else{
            System.out.println("Aluno reprovado por falta");
        }

        System.out.print("-------FIM DO PROGRAMA-------\n\n");

    }
}
