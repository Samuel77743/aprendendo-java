import java.util.List;
import java.io.IOException;
import java.nio.file.*;


public class Exercicio040 {
    public static void main(String[] args) {
        //Lendo texto 
        String arquivo = "./arquivos/exercicio040.txt";
        Path caminho = Paths.get(arquivo);

        if(Files.exists(caminho) == false) {
            System.out.println("Arquivo inexistente / não encontrado");
        }

        else {
            try {
                List<String> linhas = Files.readAllLines(caminho);
        
                for(String line : linhas) {
                    System.out.println(line);
                }
            }catch(Exception e) {
                System.out.println("ERROR");
            }
        }

       
    }
}
