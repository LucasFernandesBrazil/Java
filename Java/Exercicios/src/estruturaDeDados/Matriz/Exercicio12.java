package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Random;

public class Exercicio12 {
    public static void main(String[] args) {

        int matriz1[][] = new int[5][5];
        int matriz2[][] = new int[5][5];
        leitorMatrizRandomica(matriz1);
        leitorMatrizRandomica(matriz2);
        uniaoMatriz(matriz1, matriz2);


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

    public static int [][] uniaoMatriz (int [][] matriz1, int [][] matriz2) {
        int matrizUniao [][] = new int[matriz1.length][matriz1.length + matriz2.length];

        for (int i = 0; i < matriz1.length; i++)
            for (int j = 0; j < matriz1[0].length; j++) {
                int numero = matriz1 [i][j];
                if (!verificaSeValorExiste(matrizUniao, numero)){
                    matrizUniao [i][j] = matriz1 [i][j];
                }
            }

        for (int i = 0; i < matriz2.length; i++)
            for (int j = 0; j < matriz2[0].length; j++) {
                int numero = matriz1 [i][j];
                if (!verificaSeValorExiste(matrizUniao, numero)){
                    matrizUniao [i][j + matriz1[0].length] = matriz2 [i][j];
                }
            }

        return matrizUniao;
    }

    public static boolean verificaSeValorExiste (int matriz[][], int numero) {
        for (int i = 0; i < matriz.length; i ++)
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz [i][j] == numero) {
                    return true;
                }
            }
        return false;
    }
}
