package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int matriz1 [][] = new int[4][4];
        int matriz2 [][] = new int[4][4];
        int matriz3 [][] = new int[4][4];

        System.out.println("Matriz 1:");
        leitorDeMatriz(matriz1);
        System.out.println("Matriz 2:");
        leitorDeMatriz(matriz2);

        System.out.println("Matriz com os maiores elementos da matriz 1 e 2: ");
        comparadorDeMatriz(matriz1, matriz2, matriz3);
        printMatriz(matriz3);

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

    //Função para comparar as matrizes passdas pelo usuário
    public static int [][] comparadorDeMatriz (int x [][], int y [][], int matriz3[][]) {
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {

                if (x[i][j] < y [i][j]) {
                    matriz3 [i][j] = y [i][j];
                }

                    if (x[i][j] > y [i][j]) {
                        matriz3 [i][j] = x [i][j];
                    }

                        if (x[i][j] == y [i][j]) {
                            matriz3 [i][j] = x [i][j];
                        }
            }
        return matriz3;
    }


    //Método para escrever os valores das matrizes
    public static void printMatriz (int x [][]) {
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                System.out.print("\n["+(i+1)+"]["+(j+1)+"] = " + x[i][j]);
            }
    }
}
