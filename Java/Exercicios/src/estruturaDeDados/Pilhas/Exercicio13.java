package exercicios.pilhas;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StaticStack pilha = new StaticStack(5);

        for (int i = 0; i < pilha.length(); i ++) {
            System.out.print("Informe o elemento -> ");
            pilha.push(scan.nextInt());
        }

        System.out.print("Informe um valor a ser buscado: ");
        int c = scan.nextInt();

        removeC(c, pilha);

    }

    public static void removeC (int c, StaticStack pilha) {
        int aux [] = new int[pilha.length()-1];
        int posicao = 0;
        int elemento;

        while (!pilha.isEmpty()) {
            elemento = pilha.pop();
            if (elemento != c) {
                aux [posicao] = elemento;
                posicao++;
            }
        }

        for (int i = aux.length-1; i > -1; i--) {
            pilha.push(aux[i]);
        }
    }
}
