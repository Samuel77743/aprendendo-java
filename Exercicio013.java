import java.util.Arrays;

/**
 * Exercicio013
 */
public class Exercicio013 {
    public static void main(String[] args) {

        int[] num = {4, 1, 5, 3, 2};

        Arrays.sort(num); //Ordenação em ordem crescentes dos valores dos índices

        for(int n:num){
            System.out.printf("%d - ", n);
        }
        System.out.print("\n\n");

        final int tam = 5;
        int[] num2 = new int[tam]; //Vetor com valores de índices todos zerados
        
        for(int n: num2){
            System.out.printf("%d - ", n);
        }
        System.out.println("");

        Arrays.fill(num2, 2023); //Preenchendo 2023 em todas posições

        for(int n:num2){
            System.out.printf("%d -", n);
        }

        //Comparando  num(1, 2, 3, 4, 5) com num2(2023, 2023..)
        //Arrays.equals(num, num2); <--
        boolean confirm = Arrays.equals(num, num2);
        System.out.printf("\n\nOs arrays são iguais --> %s", confirm ? "Sim\n\n" : "Não\n\n"); 

        int pesquisa = 6;
        int resp = Arrays.binarySearch(num, pesquisa);

        System.out.printf("Existe o valor %d no vetor num --> %s", pesquisa, resp >= 0 ? "Sim, na posição "+resp : "Não");
    }
    
}