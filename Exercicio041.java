import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

public class Exercicio041 {
    public static void main(String[] args) {
        
        //Extraindo bytes do arquivo '1' e sobrescrevendo no '2'
        
        Path imagem1 = Paths.get("./arquivos/imagens/1.png");
        Path imagem2 = Paths.get("./arquivos/imagens/2.png");

        try {
            byte[] bytesImagem1 = Files.readAllBytes(imagem1);
            Files.write(imagem2, bytesImagem1);

        }catch(Exception e) {
            System.out.println("Erro");
        }
    }
}
