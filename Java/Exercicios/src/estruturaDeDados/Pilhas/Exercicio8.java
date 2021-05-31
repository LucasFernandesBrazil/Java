package exercicios.pilhas;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        StaticStack stack = new StaticStack(5);
        escreverPilha(stack);
        maiorMenorMediaAritmedica(armazenadorValoresPilhas(stack));
    }

    public static StaticStack escreverPilha(StaticStack x) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < x.length(); i++) {
            System.out.print("Informe o valor a ser empilhado ->");
            x.push(scan.nextInt());
        }
        return x;
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


    public static void maiorMenorMediaAritmedica(int[] x) {
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int mediaAritmedica;

        for (int i = 0; i < x.length; i++) {
            if (i == 0) {
                maior = x[i];
            }
            if (x[i] > maior) {
                maior = x[i];
            }
        }

        for (int i = 0; i < x.length; i++) {
            if (i == 0) {
                menor = x[i];
            }
            if (x[i] < menor) {
                menor = x[i];
            }
        }

        for (int i = 0; i < x.length; i++) {
            soma = soma + x[i];
        }
        mediaAritmedica = soma / x.length;

        System.out.println("Maior elemento: " + maior +
                           "\nMenor elemento: " + menor +
                           "\nMédia aritmédica: "+ mediaAritmedica);
    }

}
