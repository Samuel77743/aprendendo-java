public class Exercicio030 {
    public static void main(String[] args) {

        //Usando parâmetro args
        if(args.length <= 0) {
            System.out.println("Não há parâmetros no método 'main'");
        }

        else {
            int i = 0;
            int soma = 0;

            for(String n:args) {
                i = Integer.valueOf(n);
                soma += i;
            }
            System.out.print("Soma de: ");
            for(int j = 0; j < args.length; j++) {
                if(j == 0){
                    System.out.printf("%s", args[j]);
                }
                else {
                    System.out.printf(" + %s", args[j]);
                }
            }
            System.out.print(" = " + soma);
        }
    }
}