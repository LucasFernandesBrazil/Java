package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        int matrizA [][] = new int[3][3];
        int matrizB [][] = new int[3][3];

        System.out.println("Matriz A: ");
        leitorDeMatriz(matrizA);
        System.out.println("Matriz B: ");
        leitorDeMatriz(matrizB);

        System.out.println("Matriz soma: ");

        printMatriz(somaDeMatrizes(matrizA,matrizB));


    }

    //Função para ler do usuário os valores das matrizes
    public static int[][] leitorDeMatriz(int x[][]) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                System.out.print("Infome a posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                x[i][j] = scan.nextInt();
            }
        return x;
    }

    public static int [][] somaDeMatrizes (int x [][], int y [][]) {
        int matrizSoma [][] = new int[x.length][x.length];

        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                matrizSoma [i][j] = x [i][j] + y [i][j];
            }
        return  matrizSoma;
    }

    public static void printMatriz (int x [][]) {

        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {

                if (x [i][j] < 10) {
                    System.out.print(x[i][j] +  "   ");
                }
                if (x [i][j] >= 10) {
                    System.out.print(x[i][j] +  "  ");
                }
                if (i == 0 && j == 2) {
                    System.out.print("\n");
                }
                if (i == 1 && j == 2) {
                    System.out.print("\n");
                }
            }
    }
}
