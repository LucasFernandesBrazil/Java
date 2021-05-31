package exercicios.Linguagem1.POO.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contador a = new Contador();
        int opcaoSaida = 1;
        int opcaoZerar;
        System.out.println("==-=-==-=-==-= Contador =-==-=-==-=-==");
        while (opcaoSaida == 1) {
            System.out.println("Contador -> " + a.retornarValorContador());
            System.out.print("Deseja encerrar o contador?" +
                    "\n [0] - Sair" +
                    "\n [1] - Continuar" +
                    "\n -> ");
            opcaoSaida = scan.nextInt();
            a.incrementar();
        }
        a.diminuirUmaPosicao();
        System.out.println("\n\nContador -> " + a.retornarValorContador());
        System.out.println("Deseja zerar o contador? " +
                "\n [0] - Sim" +
                "\n [1] - Não" +
                "\n -> ");
        opcaoZerar = scan.nextInt();
        if (opcaoZerar == 0) {
            a.zerar();
        }
        System.out.println("Contador -> " + a.retornarValorContador());
    }
}
