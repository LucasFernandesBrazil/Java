package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        int matriz [][] = new int[4][4];

        leitorDeMatriz(matriz);

        System.out.println("Total de elementos maiores que 10: " + comparadorDeElementos(matriz));
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

    public static int comparadorDeElementos (int x [][]) {

        int contador = 0;

        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                if (x [i][j] > 10) {
                    contador++;
                }
            }
        return contador;
    }
}
