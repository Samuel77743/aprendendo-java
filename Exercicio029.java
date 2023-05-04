public class Exercicio029 {
    public static void main(String[] args) {
        
        System.out.printf("Soma --> %d", soma(15, 2, 20, 18, 40));
    }

    public static int soma(int... values) {
        int resp = 0;
        for(int i:values) {
            resp += i;
        }
        return resp;
    }
}
