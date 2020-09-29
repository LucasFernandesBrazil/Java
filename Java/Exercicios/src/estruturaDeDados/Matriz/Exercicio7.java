package Java.Exercicios.src.estruturaDeDados.Matriz;
import java.util.Random;

public class Exercicio7 {

    public static void main(String[] args) {

        int matriz[][] = popularMatrizRandomico();
        int diagonalPrincipal[] = encontrarDiagonalPrincipal(matriz);
        int diagonalSecundaria[] = encontrarDiagonalSecundaria(matriz);

        printarMatriz(matriz);
        trocarDiagonais(diagonalPrincipal, diagonalSecundaria, matriz);

        System.out.println("=============");

        printarMatriz(matriz);
    }

    public static int[][] popularMatrizRandomico() {
        Random gerador = new Random();
        int matriz[][] = new int[5][5];
        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                matriz[linha][coluna] = gerador.nextInt(10);
            }
        }

        return matriz;
    }

    public static int[] encontrarDiagonalPrincipal(int matriz[][]) {
        int diagonalPrincipal[] = new int[matriz.length];

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (linha == coluna) {
                    diagonalPrincipal[linha] = matriz[linha][coluna];
                }
            }
        }
        return diagonalPrincipal;
    }

    public static int[] encontrarDiagonalSecundaria(int matriz[][]) {
        int diagonalSecundaria[] = new int[matriz.length];

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if(linha + coluna == matriz.length - 1) {
                    diagonalSecundaria[linha] = matriz[linha][coluna];
                }
            }
        }
        return diagonalSecundaria;
    }

    public static void printarMatriz(int matriz[][]) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("[" + matriz[linha][coluna] + "]");
            }
            System.out.println();
        }
    }

    public static void trocarDiagonais(int diagonalPrincipal[], int diagonalSecundaria[], int matriz[][]) {
        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (linha == coluna) {
                    matriz[linha][coluna] = diagonalSecundaria[linha];
                }

                if (linha + coluna == matriz.length - 1) {
                    matriz[linha][coluna] = diagonalPrincipal[linha];
                }
            }
        }
    }
}