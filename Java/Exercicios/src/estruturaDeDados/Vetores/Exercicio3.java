package Java.Exercicios.src.estruturaDeDados.Vetores;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        /** Crie um algoritmo que leia 50 valores
         e insira em um array.Posteriormente,
         calcule a média aritmética dos valores do array. */
        Scanner scan = new Scanner(System.in);
        double vetor[] = new double [50];

        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Insira o valor [" + indice + "]= ");
            vetor[indice] = scan.nextInt();
        }
        int calculoDaMediaAritmetica = calculoDaMediaAritmetica(vetor);
        System.out.println("A media aritmética é: "+calculoDaMediaAritmetica);
    }

    public static int calculoDaMediaAritmetica(double vetor[]) {
        int media = 0;
        int total = 0;
        for (int indice = 0; indice < vetor.length; indice++) {
            total += vetor[indice];
            media = total / (vetor.length);
        }
        return media;
    }
}