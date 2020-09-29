package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int matriz[][] = new int[10][10];
        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < matriz.length; i++ )
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Infome a posição ["+(i+1)+"]["+(j+1)+"]: ");
                matriz [i][j] = scan.nextInt();

                if (i == 0 && j == 0) {
                    maior = matriz [i][j];
                }

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
        }

        System.out.println("Maior elemento da matriz: \n[" + (linha+1) +"]["+ (coluna+1) + "] = "+ maior);

    }
}
