package exercicios.pilhas;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        StaticStack stack = new StaticStack(10);
        escreverPilha(stack);
        armazenadorValoresPilhas(stack);
        lerPilha(stack);
    }

    public static StaticStack escreverPilha (StaticStack x) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < x.length(); i++) {
            System.out.print("Informe o valor a ser empilhado -> ");
            x.push(scan.nextInt());
        }
        return x;
    }

    public static int[] armazenadorValoresPilhas(StaticStack x) {
        int vetorAux[] = new int[x.length()];
        for (int i = 0; i < x.length(); i++) {
            vetorAux[i] = x.pop();
        }
        for (int i = 0; i < x.length(); i++) {
            x.push(maiorElemento(vetorAux));
        }
        return vetorAux;
    }

    public static int maiorElemento (int [] x) {
        int maior = 0;
        int posicao = 0;
        for (int i = 0; i < x.length; i++) {
            if (i == 0) {
                maior = x[i];
                posicao = i;
            }
            if (x[i] > maior) {
                maior = x[i];
                posicao = i;
            }
        }
        x[posicao] = 0;
        return maior;
    }

    public static void lerPilha (StaticStack x) {
        System.out.println("Pilha: ");
        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.pop());
        }
    }
}
