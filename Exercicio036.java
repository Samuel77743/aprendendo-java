public class Exercicio036 {
    public static void main(String[] args) {
        
        //String são um array de Chars
        char[] nome = {'S', 'a', 'm', 'u', 'e', 'l'};
        String texto = new String("Silva");


        //Instanciações de objetos da classe String:
        String s1 = new String(); //Construtor padrão e vazio
        String s2 = new String("Meu nome é Samuel, dai-me um emprego");//com parametro
        String s3 = new String(texto);
        String s4 = new String(nome, 0, 5); //parametros que determinam indices que deseja selecionar, no caso da posicao 0 ate ANTES da posicao 5

        //Métodos da classe String:
        int tam = s2.length(); //Retorna a quantidade de indices
        char letra = s3.charAt(2); //Retorna o caractere do indice 2

        //Copiando caracteres de uma string para posicoes de um char[]
        char[] s5 = new char[10];
        s2.getChars(11, 17, s5, 0);

    }
}
