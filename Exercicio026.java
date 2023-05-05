public class Exercicio026 {
    public static void main(String[] args) {
        
        //Verificando se valores dos indices pares ou ímpares usando array de parametro numa
        //Função

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        parImpar(numeros);
    }

    public static void parImpar(int[] num) {
                
        for(int n:num) {
            if(n % 2 == 0) {
                System.out.println(n + " --> PAR");
            }
            else {
                System.out.println(n + " --> ÍMPAR");
            }
        }
    }
}
