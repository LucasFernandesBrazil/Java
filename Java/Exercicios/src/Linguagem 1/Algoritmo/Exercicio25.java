package exercicios.Linguagem1.Algoritmo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vetor [] = new int [99];
        int soma = 0;
        int media;

        for (int i = 12; i < vetor.length; i++) {
            soma = i + soma;
        }

        media = soma / 86;

        System.out.println("Média aritmédica: " + media);
    }
}
