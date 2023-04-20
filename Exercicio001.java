
public class Exercicio001{

    public static void main(String[] args) {
        
        //Criar ByteCode com suporte UTF-8 --> javac -encoding UTF-8 <arquivo.java>

        System.out.println("Eae mundo."); //Adiciona quebra de linha no final
        System.out.print("Olá mundo!"); //Não adiciona nenhuma quebra de linha automática
        System.out.printf("%n%s%n%n", "Olá Mundo cruel."); 
        //É formatado como printf do C ou .format do Python
        
        /* \n VS %n 
         * \n --> Aplica uma quebra de linha, mas alguns S.O. pode sofrer incompatibilidade(raramente)
         * ls
         * %n --> É usado dentro da formatação de um printf, também quebra a linha mas é mais universalmente compatível.
        */
    }
}
