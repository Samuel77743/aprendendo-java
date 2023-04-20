/**
 * Exercicio014
 */
public class Exercicio014 {
    public static void main(String[] args) {
        
        int[] original = {1, 2, 3, 4, 5};
        int[] copia = new int[original.length];

        System.arraycopy(original, 0, copia, 0, original.length); //Copiando

        //Impressão dos valores dos índices do original
        System.out.println("\nOriginal:");
        for(int n: original){
            System.out.printf("%d - ", n);
        }
        System.out.println("\n\nCópia:");

        for(int n: copia){
            System.out.printf("%d - ", n);
        }

    }
    
}