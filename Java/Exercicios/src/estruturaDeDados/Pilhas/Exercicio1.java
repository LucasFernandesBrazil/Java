package exercicios.pilhas;

import java.util.Scanner;

public class  Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StaticStack pilha = new StaticStack(5);
        System.out.println("Informe os valores a serem empilhados: ");
        coletorDeElementos(pilha);
        desempilhadorComparador(pilha);

    }

    public static StaticStack coletorDeElementos (StaticStack x) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < x.length(); i++) {
            System.out.print("--> ");
            x.push(scan.nextInt());
        }
        return x;
    }

    public static void desempilhadorComparador (StaticStack x) {
        int aux;
        while (!x.isEmpty()) {
            aux = x.pop();
            if (aux % 2 == 0) {
                System.out.println(aux + " é um valor par!");
            }
            if (aux % 2 != 0) {
                System.out.println(aux + " é um valor ímpar!");
            }
        }
    }
}
