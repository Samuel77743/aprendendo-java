import java.util.HashMap;

public class Exercicio044 {
    public static void main(String[] args) {

        HashMap<Integer, String> carros = new HashMap<Integer, String>();

        int i = 1;

        //Adicionando elemento no HashMap
        carros.put(i++, "Polo");
        carros.put(i++, "HRV");
        carros.put(i++, "Golf");
        carros.put(i++, "Camaro");
        carros.put(i++, "Mustang");
        carros.put(i++, "Cruze");

        //Imprimindo posição especifica
        System.out.println("Imprimindo posição específica");
        System.out.println(carros.get(3));

        //Imprimindo todos elementos com FOR normal
        System.out.println("\nImprimindo cada elemento com FOR normal");
        for(int j = 1; j <= carros.size(); j++) {
            System.out.println(carros.get(j));
        }

        //Imprimindo com For-each
        System.out.println("\nImprimindo cada elemento com FOR-EACH");
        for(String j : carros.values()) {
            System.out.println(j);
        }

        //Removendo pela chave
        System.out.println("\nRemovendo elemento");
        carros.remove(2);
        System.out.println(carros);
        System.out.println("Valor da key 2 --> " + carros.get(2));

    }
}
