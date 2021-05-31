package exercicios.Linguagem1.Algoritmo;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vetor [] = new int[5];
        int maior = 0;
        int menor = 0;
        int media = 0;
        int impares = 0;
        int pares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor [" + (i +1) + "] -> ");
            vetor [i] = scan.nextInt();
            media = vetor [i] + media;

            if (i == 0) {
                maior = vetor [0];
                menor = vetor [0];
            }

                if (vetor [i] > maior){
                    maior = vetor [i];
                }

                    if (vetor [i] < menor) {
                        menor = vetor [i];
                    }

                        if (vetor [i] % 2 == 0) {
                            pares = pares + 1;
                        }

                            if (vetor [i] % 2 != 0) {
                                impares = impares + 1;
                            }

        }

        media = media / vetor.length;

        System.out.println("Maior valor: " + maior +
                "\nMenor valor: " + menor +
                "\nMédia aritmética: " + media +
                "\nQuantidade de pares: " + pares +
                "\nQuantidade de ímpares: "+ impares);

    }
}
