/**
 * Exercicio019
 */

 public class Exercicio019 {
    public static void main(String[] args) {
        //Testando o método tipado em int:
        int resp_int = soma(2, 3);
        System.out.printf("Resultado --> %d", resp_int);

        Double resp_float = soma(7.5, 6.7);
        System.out.printf("\n\nResultado --> %.2f", resp_float);
    } 

    public static int soma(int... numero) {
        int resp = 0;
        for(int n : numero){
            resp += n;
        }
        return resp;
    }

    public static Double soma(Double... numero) {
        Double resp = 0.0;
        for(Double n : numero){
            resp += n;
        }
        return resp;
    }
 }