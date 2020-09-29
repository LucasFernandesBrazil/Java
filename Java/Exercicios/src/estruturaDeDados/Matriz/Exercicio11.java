package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        int matrizAlunos [][] = new int[100][10];
        int gabarito [] = new int [10];
        System.out.println("A - 0" +
                "\nB - 1" +
                "\nC - 2" +
                "\nD - 3");
        construtorDeMatriz(matrizAlunos);
        gabaritoVetor(gabarito);
        System.out.println("Vetor resultado: " + Arrays.toString(vetorResultado(matrizAlunos, gabarito)));
    }

    public static int[][] construtorDeMatriz(int x[][]) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                System.out.print("["+(i+1)+"] Aluno - Questão ["+(j+1)+"] ->");
                x[i][j] = scan.nextInt();
            }
        return x;
    }

    public static int[][] construtorDeMatrizRandom(int x[][]) {
        Random sorteio = new Random();
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                x[i][j] = sorteio.nextInt(4);
            }
        return x;
    }

    public static int [] gabaritoVetor (int x []) {

        // A - 0  B - 1  C - 2  D -3
        x [0] = 0;
        x [1] = 3;
        x [2] = 2;
        x [3] = 2;
        x [4] = 1;
        x [5] = 3;
        x [6] = 0;
        x [7] = 1;
        x [8] = 3;
        x [9] = 0;

        return x;
    }

    public static int [] vetorResultado (int x[][], int y []) {
        int resultado [] = new int [x.length];
        int contador = 0;
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                    if (x[i][j] == y[j]) {
                        resultado [i] += 1;
                    }
            }
        return resultado;
    }
}
