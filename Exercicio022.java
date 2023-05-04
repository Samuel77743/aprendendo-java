public class Exercicio022 {
    public static void main(String[] args) {

        //Funcionamento do CONTINUE

        //Printa números de 1 a 30, exceto os que estão entre 12 e 17

        for(int i = 1; i <= 30; i++) {
            if(i >= 12 && i <= 17 ) {
                continue;
            }
            else {
                System.out.print(i + " - ");
            }
        }
    }
}
