package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Random;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int matriz1[][] = new int[5][5];
        int i, j;
        leitorMatrizRandomica(matriz1);
        System.out.println("Matriz randômica:");
        printMatriz(matriz1);
        jumpLine();
        System.out.print("====== LOCALIZADOR DE ELEMENTOS ======" +
                "\n Informe a linha -> ");
        i = scan.nextInt();
        System.out.print("\nInforme a coluna ->");
        j = scan.nextInt();
        jumpLine();
        if (localizadorElementoMatriz(matriz1,i,j) == -1) {
            System.out.println("Posição inválida!");
        }
        else {
            System.out.print("Elemento localizado: " + localizadorElementoMatriz(matriz1,i,j));
        }

    }


    public static int[][] leitorMatrizRandomica(int x[][]) {
        Random random = new Random();
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                x[i][j] = random.nextInt(100);
            }
        return x;
    }

    public static int localizadorElementoMatriz (int matriz [][], int i, int j) {
        int verificador = -1;
        if (i - 1 < matriz.length && j - 1 < matriz[0].length) {
            verificador = matriz [i-1][j-1];
        }
        return verificador;
    }


    public static void printMatriz(int x[][]) {

        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {

                if (x[i][j] < 10) {
                    System.out.print(x[i][j] + "   ");
                }
                if (x[i][j] >= 10) {
                    System.out.print(x[i][j] + "  ");
                }
                if (i == 0 && j == 4) {
                    System.out.print("\n");
                }
                if (i == 1 && j == 4) {
                    System.out.print("\n");
                }
                if (i == 2 && j == 4) {
                    System.out.print("\n");
                }
                if (i == 3 && j == 4) {
                    System.out.print("\n");
                }
            }
    }

    public static void jumpLine() {
        System.out.print("\n\n");
    }

    public static void booleanReader(boolean x) {
        if (x == true) {
            System.out.print("Verdadeiro!");
        } else {
            System.out.print("Falso!");
        }
    }
}

