package exercicios.Linguagem1.Algoritmo;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        double lata = 0.35;
        double garrafaMedia = 0.6;
        double garrafaGrande = 2;
        int quantidade;

            System.out.print ("=-==-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                              "             M E I A - C O L A \n" +
                              "         Realize seu pedido abaixo:\n" +
                              "=-==-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n\n");

            System.out.print("--------------------------------------------\n" +
                    "Produto: Lata (350Ml)\n" +
                    "Quantidade: ");
            quantidade = scan.nextInt();
            lata = lata * quantidade;

            LimparTela();

            System.out.print("--------------------------------------------\n" +
                    "Produto: Garrafa (600Ml)\n" +
                    "Quantidade: ");
            quantidade = scan.nextInt();
            garrafaMedia = garrafaMedia * quantidade;

            LimparTela();

            System.out.print("--------------------------------------------\n" +
                    "Produto: Garrafa (600Ml)\n" +
                    "Quantidade: ");
            quantidade = scan.nextInt();
            garrafaGrande = garrafaGrande * quantidade;

            double total = lata + garrafaGrande + garrafaMedia;

            LimparTela();

            System.out.println("-*--*-*--*-*--*- TOTAL DE LITROS NO PEDIDO -*--*-*--*-*--*-\n" +
                               "                           "+ total + "L");


    }

    private static void LimparTela () {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
