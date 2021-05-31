package exercicios.Linguagem1.Algoritmo;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A, B, opcao;

        System.out.print ("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                          "          C A L C U L A D O R A\n" +
                          "=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                          "\n\n");

        System.out.print("Primeiro valor: ");
        A = scan.nextInt();

        System.out.print("Segundo valor: ");
        B = scan.nextInt();

        menu ();
        opcao = scan.nextInt();

        while (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida! ");
            menu ();
            opcao = scan.nextInt();
        }

        LimparTela();

        if (opcao == 1) {
            System.out.println("Soma: " + soma(A, B));
        }

            if (opcao == 2) {
                System.out.println("Subtração: "+ subtraçao(A, B));
            }

                if (opcao == 3) {
                    System.out.println("Multiplicação: "+ multiplicacao(A, B));
                }

                    if (opcao == 4) {
                        System.out.println("Divisão: "+ divisao(A, B));
                    }

    }


    private static void LimparTela () {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }


    public static void menu () {
        System.out.print("\n\n=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                "          SELECIONE UMA OPÇÃO\n\n" +
                "[1] Adição\n" +
                "[2] Subtração\n" +
                "[3] Multiplicação\n" +
                "[4] Divisão\n\n" +
                "=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                "--> ");
    }


    public static int soma (int A, int B) {
        int soma = A + B;
        return soma;
    }


    public static int subtraçao (int A, int B) {
        int subtracao = A - B;
        return subtracao;
    }


    public static int multiplicacao (int A, int B) {
        int multiplicacao = A * B;
        return multiplicacao;
    }


    public static int divisao (int A, int B) {
        int divisao = A / B;
        return divisao;
    }

}
