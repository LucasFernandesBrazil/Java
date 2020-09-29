package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Random;

public class Exercicio15 {
    public static void main(String[] args) {

        int matriz1[][] = new int[5][5];
        int matriz2[][] = new int[5][5];
        leitorMatrizRandomica(matriz1);
        leitorMatrizRandomica(matriz2);
        System.out.println("Matriz randômica 1:");
        printMatriz(matriz1);
        jumpLine();
        System.out.println("\nMatriz randômica 2: ");
        printMatriz(matriz2);
        jumpLine();
        System.out.print("As matrizes são iguais: ");
        booleanReader(igualdadeMatriz(matriz1, matriz2));


    }

    //Função para ler do usuário os valores das matrizes
    public static int[][] leitorMatrizRandomica(int x[][]) {
        Random random = new Random();
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                x[i][j] = random.nextInt(100);
            }
        return x;
    }

    public static boolean igualdadeMatriz(int[][] matriz1, int[][] matriz2) {
        int matrizdiferenca[][] = new int[matriz1.length][matriz1.length];


        for (int i = 0; i < matriz2.length; i++)
            for (int j = 0; j < matriz2[0].length; j++) {
                int numero = matriz2[i][j];
                if (verificaSeValorExiste(matriz1, numero)) {
                    matrizdiferenca[i][j] = matriz2[i][j];
                } else {
                    return false;
                }
            }

        return true;
    }

    public static boolean verificaSeValorExiste(int matriz[][], int numero) {
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == numero) {
                    return true;
                }
            }
        return false;
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

    public static void booleanReader (boolean x) {
        if (x == true) {
            System.out.print("Verdadeiro!");
        }
        else {
            System.out.print("Falso!");
        }
    }
}