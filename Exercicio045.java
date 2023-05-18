import java.util.HashSet;

public class Exercicio045 {
    public static void main(String[] args) {
        
        HashSet<String> herois = new HashSet<String>();

        // Adicionando elementos com HashSet
        // --> Não repete elementos de mesmo valores, e a ordem da impressao é aleatória
        herois.add("Super-man");
        herois.add("Batman");
        herois.add("Coringa");
        herois.add("Batman");
        herois.add("Wonder Woman");
        herois.add("Miranha");
        herois.add("Ben 10");
        

        System.out.println(herois);
    }
}
