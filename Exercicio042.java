import java.util.Stack;

public class Exercicio042 {
    public static void main(String[] args) {
        
        Stack<String> carros = new Stack<>();
        
        //Adicionar item a pilha
        carros.push("Fiat Uno");
        carros.push("Gol");
        carros.push("Fiesta");
        carros.push("HB20");
        carros.push("Linea");
        carros.push("Stilo");

        //Printando todos elementos
        System.out.println("Todos elementos --> " + carros);

        //Printando o ultimo elemento adicionado
        System.out.println("Topo da pilha (.peek) --> " + carros.peek());
        
        //Printando o ultimo elemento e removendo-o
        System.out.println("Usando .pop --> " + carros.pop());
        System.out.println("Pilha depois do pop --> " + carros);

        //Retorno booleano conferindo se a pilha tem ou não elementos
        System.out.println(carros.empty() ? "Pilha vazia" : "Pilha com elemento(s)");

        //Excluindo todos elementos da pilha
        carros.clear();
        System.out.println(carros.empty() ? "Pilha vazia" : "Pilha com elemento(s)");
 
    }
}
