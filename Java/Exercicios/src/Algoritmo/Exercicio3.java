package Java.Exercicios.src.Algoritmo;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double P1, P2, media;

        System.out.print ("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                            "   C A L C U L A D O R  DE  M É D I A \n" +
                          "=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                          "\n\n");

        System.out.print ("Informe sua P1 -> ");
        P1 = scan.nextInt();

        System.out.print ("Informe sua P2 -> ");
        P2 = scan.nextInt();

        media = ((P1*0.4) + (P2*0.6));

        System.out.print ("Média: " + media);
        doNothing(scan);
    }

    private static void doNothing(Scanner s) {}
}
