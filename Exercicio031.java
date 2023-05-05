import java.security.SecureRandom;

public class Exercicio031 {
    public static void main(String[] args) {
        
        final int linhas = 5;
        final int colunas = 4;

        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++) {

            for(int j = 0; j < colunas; j++) {
                matriz[i][j] = new SecureRandom().nextInt(100);
            }
        }

        //Imprimindo valores que foram atribuidos:
        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.printf("Matriz[%d][%d] --> %d\n", i, j, matriz[i][j]);
            }
            System.out.println();
        }
    }
}
