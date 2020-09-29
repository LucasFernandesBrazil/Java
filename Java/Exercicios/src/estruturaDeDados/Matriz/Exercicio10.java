package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {

        int matriz[][] = new int[6][6];
        System.out.print("Matriz sorteada: ");
        construtorDeMatrizRandom(matriz);
        System.out.println("\n");
        printMatriz(matriz);
        somaDeElementosColunasImpares(matriz);
        mediaAritmedicaElementos(matriz);
        maiorValorDaMatriz(matriz);
        menorValorDiagonalSecundaria(matriz);
        mediaAritmedicaMatriz(matriz);


    }

    public static int[][] construtorDeMatrizRandom(int x[][]) {
        Random sorteio = new Random();
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                x[i][j] = sorteio.nextInt(99);
            }
        return x;
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
                if (i == 0 && j == 5) {
                    System.out.print("\n");
                }
                if (i == 1 && j == 5) {
                    System.out.print("\n");
                }
                if (i == 2 && j == 5) {
                    System.out.print("\n");
                }
                if (i == 3 && j == 5) {
                    System.out.print("\n");
                }
                if (i == 4 && j == 5) {
                    System.out.print("\n");
                }
            }
    }

    public static void somaDeElementosColunasImpares(int x[][]) {
        int aux = 0;
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                if (j % 2 != 0) {
                    aux = aux + x[i][j];
                }
            }
        System.out.println("\nSoma dos elementos das colunas ímpares: " + aux);
    }

    public static void mediaAritmedicaElementos(int x[][]) {
        int aux = 0;
        int contador = 0;
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                if (i == 1 || i == 3) {
                    aux = aux + x[i][j];
                    contador++;

                }
            }
        int media = aux / contador;
        System.out.println("\nMedia aritmédica dos elementos da segunda e quarta linha:  " + media);
    }

    public static void maiorValorDaMatriz(int x[][]) {
        int maior = 0;
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                if (i == 0 && j == 0) {
                    maior = x[i][j];
                }
                if (x[i][j] > maior) {
                    maior = x[i][j];
                }
            }
        System.out.println("\nMaior elemento da matriz: " + maior);
    }

    public static void menorValorDiagonalSecundaria(int x[][]) {
        int elementoMenor = 0;
        int menor [] = new int[x.length];
            for(int i = x.length - 1; i >= 0; i--) {
                for(int j = x.length - 1; j >= 0; j--) {
                    if(i + j == x.length -	1) {
                            menor [i] = x[i][j];
                    }
                }
            }
            for (int i = 0; i < x.length; i++) {
                if (i == 0) {
                    elementoMenor = menor [i];
                }
                if (menor [i] < elementoMenor) {
                    elementoMenor = menor [i];
                }
            }
        System.out.println("\nMenor elemento da diagonal secundária: " + elementoMenor);
    }

    public static void mediaAritmedicaMatriz (int x [][]) {
        int aux = 0;
        int contador = 0;
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                aux = aux + x[i][j];
                contador++;
            }
        int media = aux / contador;
        System.out.println("\nMedia aritmédica da matriz:  " + media);
    }
}