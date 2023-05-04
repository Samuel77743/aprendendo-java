public class Exercicio023 {

    public static void main (String[] args) {

        //Revendo Arrays
        //Declaração de Array do tipo INT com 5 posições (de 0 - 4)
        int[] num = {52, 100, 3, 15, 527}; //Atribuindo valores já na declaração
        
        //Imprimindo valores de cada posição
        System.out.println("Todos valores de cada índice em ordem crescente:");
        for(int i : num) {
            System.out.printf("%d\n", i);
        }

        System.out.println("\nTodos valores de cada índice em ordem decrescente:");
        for(int i = 4; i >= 0; i--) {
            System.out.printf("%d\n", num[i]);
        }

    }
    
}
