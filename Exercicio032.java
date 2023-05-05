import java.security.SecureRandom;

public class Exercicio032 {
    public static void main(String[] args) {

        final int linhas = 4;
        final int colunas = 3;
        
        int[][] minhaMatriz = new int[linhas][colunas];
        System.out.println("Valores Iniciais");
        mostrarValores(minhaMatriz);

        System.out.println("=====================");

        gerarValores(minhaMatriz);

        System.out.println("Valores Atribuídos");
        mostrarValores(minhaMatriz);

    }

    public static void gerarValores(int[][] matriz) {

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = new SecureRandom().nextInt(100);
            }
        }
    }

    public static void mostrarValores(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.printf("matriz[%d][%d] --> %d\n", i, j, matriz[i][j]);
            }
            System.out.println();
        }
    }
}
