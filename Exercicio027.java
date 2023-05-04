public class Exercicio027 {
    public static void main(String[] args) {
        
        int[] numeros = {13, 48, 92, 57, 62, 83, 72};
        int ap, rp;
        ap = rp =0;

        int[] resp = conferirNotas(numeros, ap, rp);

        System.out.printf("Aprovado: %d\nReprovado: %d", resp[0], resp[1]);
    }

    public static int[] conferirNotas(int[] notas, int aprov, int reprov) {
        int[] resp = new int[2];

        for(int n: notas) {
            if(n >= 60) {
                aprov++;
                resp[0] = aprov;
            }
            else {
                reprov++;
                resp[1] = reprov;
            }
        }
        return resp;
    }
}
