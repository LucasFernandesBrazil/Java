package exercicios.pilhas;

public class Exercicio2 {
    public static void main(String[] args) {
        StaticStack pilha = new StaticStack(4);
        pilha.push(1);
        pilha.push(3);
        pilha.push(4);
        pilha.push(2);
        for (int i = 0; i < pilha.length(); i++) {
            if (i == pilha.length() - 1) {
                System.out.print(pilha.pop());
            }
            else {
                System.out.print(pilha.pop() + ",");
            }
        }
    }
}
