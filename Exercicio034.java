import java.util.ArrayList;

public class Exercicio034 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(4);    
        numeros.add(15);    
        numeros.add(12);   
        mostrarPosicoesINT(numeros);
        
        try{
            int indice = 15;
            System.out.printf("Imprimindo posição %d --> %d",indice, numeros.get(indice));
        
        }catch(Exception e) {
            System.out.printf("Erro --> Este índice não existe\n %s", e.getMessage());
        }
    }

    public static void mostrarPosicoesINT(ArrayList<Integer> array) {
        int i = 0;
        for(int n : array) {
            System.out.printf("numeros[%d] --> %d\n", i++, n);
        }
    } 
}
