public class Exercicio025 {
    public static void main(String[] args) {
        //Separando letras de uma string
        String animal = "Cachorro";

        for (char n : animal.toCharArray()) {
            System.out.printf("%c - ", n );            
        }
    }
}
