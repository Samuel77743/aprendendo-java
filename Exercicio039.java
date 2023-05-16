import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercicio039 {
    public static void main(String[] args) {
        //Verificando se um DIRETÓRIO existe

        String caminho = "./bytecodes";
        Path diretorio = Paths.get(caminho); 
        
        if(Files.isDirectory(diretorio)) {
            System.out.println("Diretório Existe");
        }

        else {
            System.out.println("Diretório Inexistente");
        }

        // Verificando se um ARQUIVO existe
        String caminho_arquivo = "./arquivos/exercicio039.txt";
        File arquivo = new File(caminho_arquivo);

        if(arquivo.exists() && arquivo.isFile()) {
            System.out.println("O arquivo \"" + arquivo.getName() + "\" existe");
        }
        else {
            System.out.println("Arquivo não existe");
        }


    }
}