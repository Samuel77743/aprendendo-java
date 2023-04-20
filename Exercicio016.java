/**
 * Exercicio016
 */
public class Exercicio016 {
    public static void main(String[] args) {
        
        //Formatações de números após a vírgula
        float num1 = 100/3;
        System.out.printf("\n%.2f\n\n", num1);

        //Utilidades para alinhameto de dados:
        //Formatação de espaços em brancos
        int[] num2 = {1, 10, 100, 1000};
        for(int i = 0; i < num2.length; i++){
            System.out.printf("%4d\n", num2[i]); //indentado como se todos tivessem 4 digitos
        }
        
        System.out.print("\n\n");

        for(int i = 0; i < num2.length; i++){
            System.out.printf("%04d\n", num2[i]); //indentado preenchendo 0 a esquerda
        }

        
    }
}