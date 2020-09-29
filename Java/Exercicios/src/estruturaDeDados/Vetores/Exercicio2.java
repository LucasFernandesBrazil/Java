package Java.Exercicios.src.estruturaDeDados.Vetores;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        /** Crie um algoritmo com 30 posições, peça que o usuário
         preencha com valores aleatórios. Após preenchido identifique o
         maior e o menor elemento do array. */
        Scanner scan = new Scanner(System.in);
        int vetor [] = new int [30];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print ("Digita o valor da posição [" + i + "]= ");
            vetor [i] = scan.nextInt();
        }
        int valorMaior = valorMaior(vetor);
        System.out.println ("O maior valor é "+ valorMaior);
        int valorMenor =valorMenor(vetor);
        System.out.println ("O menor valor é "+ valorMenor);
    }
    public static int valorMaior (int vetor []) {
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
                maior = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor [i];
            }
        }
        return maior;
    }
    public static int valorMenor (int vetor[]) {
        int menor = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i == 0){
                menor = vetor[i];
            }
            if (vetor[i] < menor) {
                vetor[i] = menor;
            }
        }
        return menor;
    }
}
