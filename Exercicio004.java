/**
 * Exercicio004
 */
public class Exercicio004 {
    public static void main(String[] args) {
        
        int nota = 8, media = 6;

        String res = (nota >= media ? "Aprovado" : "Reprovado"); //Operação Ternária
        System.out.println("\nSituação do Aluno --> " + res);

        int res2 = (nota >= media ? 1 : 0);
        System.out.println("Situação do Aluno --> "+(res2 == 1 ? "Aprovado" : "Reprovado"));
    }
}