public class Exercicio038 {
    public static void main(String[] args) {
        
        //CONCATENAÇÃO
        System.out.println("CONCATENANDO:");
        String s1 = "Oi,";
        String s2 = "meu nome é Samuel";
        String s3 = s1 + ' ' + s2;

        System.out.println(s3);

        //REPLACE (trocar) vale para char ou String
        System.out.println("\nUsando REPLACE:");
        String s4 = s3.replace("Oi", "OLÁ");
        System.out.println(s4);
        
        //toLowerCase e toUppercase
        System.out.println("\nUtilizando UPPERCASE e LOWERCASE\nORIGINAL");
        String s5 = "Olá Mundo";

        System.out.println(s5);
        
        System.out.println("Uppercase:");
        System.out.println(s5.toUpperCase());

        System.out.println("Lowercase:");
        System.out.println(s5.toLowerCase());

        //trim --> REMOVE ESPAÇOS antes e dps da String
        System.out.println("\nUtilizando trim");
        String s6 = "    MUCHO ESPAÇO    "; 
        System.out.println(s6); //antes
        System.out.println(s6.trim()); //depois

        //toCharArray --> converte String para um char com posições proporcionais a da String
        System.out.println("\ntoCharArray:");
        String s7 = "Batman";

        System.out.println("Em string: " + s7);
        
        char[] c7 = s7.toCharArray();
        System.out.print("Em char: ");

        for(char i : c7) {
            System.out.print(i);
        }

        //Split
        System.out.println("\n\nUsando SPLIT:");
        String s8 = "Samuel Wanderson Silva";
        String[] ss8 = s8.split(" ");
        System.out.println("Numero de índices --> " + ss8.length);
        for(String i:ss8) {
            System.out.println(i);
        }

    }
}