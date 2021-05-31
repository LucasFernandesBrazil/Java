package exercicios.pilhas;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StaticStack pilha = new StaticStack(10);
        escreverPilha(pilha);
        parImpar(armazenadorValoresPilhas(pilha));

    }

    public static void escreverPilha (StaticStack pilha) {
        Scanner scan = new Scanner(System.in);

        for (int contador = 0; contador < pilha.length(); contador++) {
            System.out.print("Digite o elemento: ");
            pilha.push(scan.nextInt());
        }
    }

    public static int[] armazenadorValoresPilhas(StaticStack x) {
        StaticStack pilhaAux = new StaticStack(x.length());
        int vetorAux[] = new int[x.length()];
        for (int i = 0; i < x.length(); i++) {
            vetorAux[i] = x.pop();
            pilhaAux.push(vetorAux [i]);
        }
        for (int i = 0; i < x.length(); i++) {
            x.push(pilhaAux.pop());
        }
        return vetorAux;
    }


    public static void parImpar(int[] x) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                pares++;
            }
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) {
                impares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares +
                           "\nQuantidade de ímpares: " + impares);

    }

    public static void lerPilha (StaticStack x) {
        System.out.println("Pilha: ");
        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.pop());
        }
    }
}
