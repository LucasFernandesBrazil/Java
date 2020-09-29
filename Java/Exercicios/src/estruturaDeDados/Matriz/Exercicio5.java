package Java.Exercicios.src.estruturaDeDados.Matriz;


import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        int matriz [][] = new int[4][4];

        System.out.println("Informe os valores da matriz 4x4: ");
        leitorDeMatriz(matriz);
        printMatriz(matriz);
        trocadorDeElementosMatriz(matriz);
        System.out.println("\n Matriz com a primeira linha trocada com a quarta coluna: ");
        printMatriz(matriz);

    }

    //Função para ler do usuário os valores das matrizes
    public static int[][] leitorDeMatriz(int x[][]) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                System.out.print("Infome a posição [" + (i + 1) + "][" + (j + 1) + "] -> ");
                x[i][j] = scan.nextInt();
            }
        return x;
    }

    //Função para trocar elementos dentro da matriz
    public static int [][] trocadorDeElementosMatriz (int x[][]) {

        int matrizAuxLinha [] = new int [x[0].length];
        int matrizAuxColuna [] = new int[x.length];


        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {

                if (i == 0 && (j == 0 || j == 1 || j == 2 || j == 3)) {
                    matrizAuxLinha [j] = x [i][j];
                }

                if (j == 3 && (i == 0 || i == 1 || i == 2 || i ==3)) {
                    matrizAuxColuna [i] = x [i][j];
                }
            }


        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++)
                for (int invertido = x.length-1; invertido >= 0; invertido--) {
                    if (i == 0 && (j == 0 || j == 1 || j == 2 || j == 3) ){
                        x[i][j] = matrizAuxColuna[i];
                    }
                if (j == 3 && (i == 0 || i == 1 || i == 2 || i == 3)) {
                    x[i][j] = matrizAuxLinha [i];
                    }
                }
        return x;
    }

    //Método para escrever os valores das matrizes
    public static void printMatriz (int x [][]) {

        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {

                if (x [i][j] < 10) {
                    System.out.print(x[i][j] +  "   ");
                }
                if (x [i][j] >= 10) {
                    System.out.print(x[i][j] +  "  ");
                }
                if (i == 0 && j == 3) {
                    System.out.print("\n");
                }
                if (i == 1 && j == 3) {
                    System.out.print("\n");
                }
                if (i == 2 && j == 3) {
                    System.out.print("\n");
                }
            }
    }
}
