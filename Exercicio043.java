import java.util.Queue;
import java.util.LinkedList;

public class Exercicio043 {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();

        fila.add("Questão de Tempo");
        fila.add("10 Coisas que eu Odeio em Você");
        fila.add("Kingsman - Serviço Secreto");
        fila.add("Spider-Man - No Way Home");
        fila.add("REC");

        System.out.println("Fila completa --> " + fila);
        System.out.println("Primeiro da Fila --> " + fila.element());

        System.out.println("Printando e Removendo primeiro --> " + fila.poll());
        System.out.println("Fila completa --> " + fila);


    }
}
