public class Exercicio028 {
    public static void main(String[] args) {
        
        int[] notas = {40, 80, 35, 93, 67};
        int[] conclusao = new int[2];

        conferirNotas(notas, conclusao);
        
        System.out.printf("Aprovado em %d matérias\n", conclusao[0]);
        System.out.printf("Reprovado em %d matérias\n", conclusao[1]);
    }

    public static void conferirNotas(int[] notas, int[] conclusao) {

        for(int n: notas) {
            if(n >= 60) {
                conclusao[0]++;
            }
            else {
                conclusao[1]++;
            }
        }
    }
    
}