/**
 * Exercicio018
 */
public class Exercicio018 {
    public static void main(String[] args) {

        //Somador Genérico limitado a somar 2 elementos
        System.out.printf("\nSomador genérico:\nResposta --> %d\n\n", somador(3, 4));

        //Somador de elementos ilimitados 
        int resultado = somadorx(4 + 3 + 15 + 12+ 20); 
        System.out.println("Somador de elementos ilimitados:\nResposta --> "+resultado);
    }


    public static int somador(int n1, int n2) {
        int resp = n1 + n2;
        return resp;
    }

    //Método com número indefinido de parâmetros
    public static int somadorx(int... numeros) {
        int res = 0;
        for(int n : numeros){
            res += n;
        }
        return res;

    }

}