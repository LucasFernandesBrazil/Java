package Java.Exercicios.src.estruturaDeDados.Vetores;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        /**Crie um algoritmo que crie um vetor de 10 posições,
        * insira os números de 1 a 10. Depois imprima os valores.
         * */
    Scanner scan = new Scanner(System.in);
    int vetor [] = new int [10];

        for(int valor = 0; valor < vetor.length; valor++) {
            System.out.print("Digite o valor da posição [" + valor + "]= ");
            vetor [valor] = scan.nextInt();
        }
        for (int valor = 0; valor < vetor.length; valor++){
            System.out.print ("[" + vetor[valor] + "]");
        }
    }
}
