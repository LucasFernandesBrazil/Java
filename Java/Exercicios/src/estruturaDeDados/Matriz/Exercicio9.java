package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Random;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao;
        System.out.print("Bem vindo ao gerador de cartelas !" +
                "\n [1] - Gerar nova cartela" +
                "\n [0] - Sair do programa" +
                "\n --> ");
        opcao = scan.nextInt();


            while (opcao != 0) {
                if (opcao != 1 ) {
                        System.out.println("Opção inválida! Digite novamente: ");
                        System.out.print("\n\n [1] - Gerar nova cartela" +
                                "\n [0] - Sair do programa" +
                                "\n --> ");
                        opcao = scan.nextInt();
                }
                int cartela[][] = new int[5][5];
                construtorDeMatrizRandom(cartela);
                System.out.println("\n");
                printMatriz(cartela);

                System.out.print("\n\n [1] - Gerar nova cartela" +
                        "\n [0] - Sair do programa" +
                        "\n --> ");
                opcao = scan.nextInt();
            }

        System.out.println("Obrigado por utilizar nosso gerador!");

    }

    public static int[][] construtorDeMatrizRandom(int x[][]) {

        Random sorteio = new Random();
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {
                x[i][j] = sorteio.nextInt(99);
            }
        return x;
    }

    public static void printMatriz (int x [][]) {

        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[0].length; j++) {

                if (x [i][j] < 10) {
                    System.out.print(x[i][j] +  "   ");
                }
                if (x [i][j] >= 10) {
                    System.out.print(x[i][j] +  "  ");
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

}
