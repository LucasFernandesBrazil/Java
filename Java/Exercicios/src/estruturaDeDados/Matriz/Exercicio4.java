package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {


        int matriz [][] = new int[5][5];

        leitorDeMatriz(matriz);

        buscadorDeValoresEmMatriz(matriz);
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

    //Função para buscar o valor de x dentro da matriz
    public static void buscadorDeValoresEmMatriz (int matriz [][]) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;

        System.out.print("Informe um número para ser pesquisado na matriz: ");
        int x = scan.nextInt();

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz [i][j] == x) {
                    contador++;
                    System.out.println("O valor de "+x+" se encontra na posição ["+ (i+1) +"]["+ (j+1) +"]");
                }
            }
        if (contador == 0) {
            System.out.println("Valor não encontrado");
        }
    }
}
