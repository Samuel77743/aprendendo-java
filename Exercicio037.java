public class Exercicio037 {
    public static void main(String[] args) {
        String nome1 = new String("Samuel");
        String nome2 = "Samuel";
        String nome3 = "sAmUeL";

        // Em tese as declarações acima tem o mesmo valor mas,
        // por nome1 ser uma instancia de objeto, será interpretado como diferentes
        // caso sejam comparado com '==', a solução é utilizar metodo .equals

        System.out.printf("\nequals:\n%s X %s\n", nome1, nome2);
        if(nome2.equals(nome1)) {
            System.out.println("Nomes iguais!");
        }
        else {
            System.out.println("Nomes diferente!");
        } 

        //equalsIgnoreCase --> não releva distinção maíuscula/minúscula
        System.out.printf("\nequalsIgnoreCase:\n%s X %s\n", nome1, nome3);
        if(nome1.equalsIgnoreCase(nome3)) {
            System.out.println("Nomes iguais!");
        }
        else {
            System.out.println("Nomes diferentes");
        }

        //compareTo --> Retorna <0 caso a s1 tenha menos chars, >0 se tiver mais, 0 se msm qnt
        String s1 = "Olá";
        String s2 = "Oi";

        System.out.println("\n.compareTo");
        int res = s1.compareTo(s2);
        System.out.println(res);

        //regionMatch --> Retorna se strings são iguais num intervalo determinado, podendo
        //escolher se vai considerar distinguir caracteres maiusculos e minusculos
        String s3 = "O mundo é incrível";
        String s4 = "O MUNDO é chato";

        System.out.println("\n.regionMatch");
        
        if(s3.regionMatches(false, 0, s4, 0, 9)) {
            System.out.println("Tem a mesma sequência de caracteres neste intervalo");
        }
        else {
            System.out.println("Não possui a mesma sequência de caracteres neste intervalo");
        }



    }
}
