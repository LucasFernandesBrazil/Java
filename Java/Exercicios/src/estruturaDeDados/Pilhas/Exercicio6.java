package exercicios.pilhas;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StaticStack numeroBinario = new StaticStack(5);
        int numeroInteiro;
        System.out.print("Informe um número: ");
        numeroInteiro = scan.nextInt();
        desempilharPilha(transformarIntEmBinario(numeroBinario, numeroInteiro));
    }

    public static boolean verificarNumeroPrimo (int x) {
        int aux = 0;
        if (x == 1) {
            aux++;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                aux++;
            }
        }
        if (aux != 0) {
            return false;
        }
        return true;
    }

    public static StaticStack transformarIntEmBinario (StaticStack pilha, int x) {
        int aux = x;
        if (x == 0) {
            for (int i = 0; i < pilha.length() ; i++) {
                pilha.push(0);
            }
        }
        if (x == 1) {
            for (int i = 0; i < pilha.length() ; i++) {
                if (i == 0) {
                    pilha.push(1);
                }
                else {
                    pilha.push(0);
                }
            }
        }
        else if (x > 1){
            while (aux != 1 || aux != 0) {
                aux = aux / 2;
                pilha.push(aux%2);

            }
        }
        return pilha;
    }

    public static void desempilharPilha (StaticStack pilha) {
        for (int i = 0; i < pilha.length(); i++) {
            if (i == pilha.length() - 1) {
                System.out.print(pilha.pop());
            }
            else {
                System.out.print (pilha.pop()+", ");
            }
        }
    }
}
