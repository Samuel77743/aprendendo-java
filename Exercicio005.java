/**
 * Exercicio005
 */
public class Exercicio005 {
    public static void main(String[] args) {

        String dia = "Sexta-Feira";
        switch(dia) {
            case "Domingo":
                System.out.println("Dia de dormir e lamentar pelo amanhã");
                break;

            case "Segunda-Feira":
                System.out.println("Dia que o Garfield odeia, e eu também.");
                break;

            case "Terça-Feira": case "Quarta-Feira": //Switch com cases de mesmo bloco
                System.out.println("Dia monótomo e genérico, só faz diferença se for feriado");
                break;

            case "Quinta-Feira":
                System.out.println("Dia quase bom");
                break;

            case "Sexta-Feira":
                System.out.println("É SEXTA-FEIRA CARA! eba.");
                break;

            case "Sábado":
                System.out.println("Sabadão é bom demais né cara, dá pra saber que é sábado só pelo clima, é bizarro.");
                break;

            default:
                System.out.println("Tem parada errada aí mermão");            
        }

        
    }
}