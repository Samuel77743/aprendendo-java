import java.util.ArrayList;

public class Exercicio033 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> palavras = new ArrayList<>();

        numeros.add(11);
        numeros.add(22);
        numeros.add(55);

        palavras.add("Cachorro"); 
        palavras.add("Gato");
        palavras.add("Capivara");
        //Defeninindo um índice onde já havia um valor, empurra todos elementos para posição seguinte. 
        palavras.add(2, "Rinoceronte"); 

              
        //Impressão dos Arrays Lists
        mostrarPosicoesINT(numeros);
        System.out.printf
        ("O número %d está na %d posição\n", 22, numeros.indexOf(22));
        
         //Retorna índice do valor informado como parametro
        numeros.clear(); //Limpar valores e retirar todos indices

        System.out.println("========================");

        mostrarPosicoesSTR(palavras);
        System.out.printf("\nPosicao 2 temos a amável --> %s", palavras.get(2));
    
    }

    public static void mostrarPosicoesINT(ArrayList<Integer> array) {
        int i = 0;
        for(int n : array) {
            System.out.printf("numeros[%d] --> %d\n", i++, n);
        }
    } 

    public static void mostrarPosicoesSTR(ArrayList<String> array) {
        int i = 0;
        for(String s: array) {
            System.out.printf("palavras[%d] --> %s\n", i++, s);
        }
    }
}