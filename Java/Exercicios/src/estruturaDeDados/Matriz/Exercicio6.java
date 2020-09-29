package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        int matriz [][] = new int[8][8];

        leitorDeMatriz(matriz);

        montadorDeMatrizTriangularInferior(matriz);
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

    //Indentificador de matriz triangular inferior. Ao final imprime a matriz
    public static void montadorDeMatrizTriangularInferior (int x [][]) {

        //Encontrando a matriz triangular
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {

                if (!(i==j || i > j)) {
                    x [i][j] = 0;
                }
            }

        //Escrevendo a matriz na tela
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x [i][j] + " ");
                if (j == (x.length - 1) ) {
                    System.out.print("\n");
                }
            }
    }
}
