public class Exercicio002{

    public static void main(String[] args){
        //Variáveis
        int num = 19; //A variável com DefaultValue receve 0 automaticamente
    
        int nota1 = 10, nota2 = 8, nota3 = 5;
        float media = (float) (nota1 + nota2 + nota3)/3; //Perceba a importância do Casting

        String nome = "Samuel Wanderson Marcelino Silva";

        System.out.printf("\nMinha idade é --> %d\n", num);
        System.out.printf("Meu nome é --> %s\n", nome);

        System.out.printf("\nA média equivale a --> %f", media);


    }

}