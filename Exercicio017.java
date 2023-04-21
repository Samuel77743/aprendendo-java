/**
 * Exercicio017
 */
public class Exercicio017 {
    public static void main(String[] args) {
        //impressor de mensagens padrão
        msg("Eae caraa");
        msg("Beleza?");
        msg("Salve");
        
        System.out.print("\n\n");

        //impressor de mensagens em loop definido
        msgl("Qual foi meu patrão", 5);

    }

    public static void msg(String texto) {
        System.out.println(texto);
    }

    public static void msgl(String texto, int vezes){
        for(int i = 1; i <= vezes; i++){
            System.out.println(texto);
        }
    }

}