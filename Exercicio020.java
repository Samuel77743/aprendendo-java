/**
 * Exercicio020
 */
public class Exercicio020 {
    public static void main(String[] args) {
        int[] i = new int[30];
        i[0] = 0;
        i[1] = 1;

        System.out.printf("%d - %d - ", i[0], i[1]);

        for(int contador = 2; contador < 30; contador++) {
            i[contador] = i[contador-1] + i[contador - 2];
            System.out.printf("%d - ", i[contador]);
        }
    }
}