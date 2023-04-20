/**
 * Exercicio015
 */

import java.security.SecureRandom;


public class Exercicio015 {
    public static void main(String[] args) {
        final int linhas = 4;
        final int colunas = 2;

        int[][] matriz = new int[linhas][colunas];

        //Preenchendo matriz
        for(int l = 0; l < linhas; l++) {
            for(int c = 0; c < colunas; c++) {
                matriz[l][c] = new SecureRandom().nextInt(100);                
            }
        }

        //Printando matriz
        for(int l = 0; l < linhas; l++) {
            for(int c = 0; c < colunas; c++) {
                System.out.printf("%2d | ",matriz[l][c]);
            }
            System.out.println("");
        }

        System.out.println("");
        
        //Preenchendo matriz na declaração:
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int[] cont: matriz2){
            for(int cont2 : cont){
                System.out.printf("%d - ", cont2);
            }
        }

    }
}