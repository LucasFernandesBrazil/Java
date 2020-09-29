package Java.Exercicios.src.Algoritmo;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double P1, P2, media;
        int comandoDeSaida;

        System.out.print ("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                "   C A L C U L A D O R  DE  M É D I A \n" +
                "=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                "\n\n");

        System.out.print ("Informe sua P1 -> ");
        P1 = scan.nextDouble();

        System.out.print ("Informe sua P2 -> ");
        P2 = scan.nextDouble();

        media = ((P1*0.4) + (P2*0.6));

        if (media >= 7){
            System.out.println("Aprovado!");
        }

        if (media < 4){
            System.out.println("Reprovado!");
        }

        if (media >= 4 && media < 7) {
            System.out.println("Fazer PS!");
        }

        System.out.println("Deseja sair? \n" +
                "[1] Sair \n" +
                "[2] Continuar");
        comandoDeSaida = scan.nextInt();

        while (comandoDeSaida == 2) {
            System.out.print ("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                    "   C A L C U L A D O R  DE  M É D I A \n" +
                    "=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                    "\n\n");

            System.out.print ("Informe sua P1 -> ");
            P1 = scan.nextDouble();

            System.out.print ("Informe sua P2 -> ");
            P2 = scan.nextDouble();

            media = ((P1*0.4) + (P2*0.6));

            if (media >= 7){
                System.out.println("\nAprovado!\n");
            }

            if (media < 4){
                System.out.println("\nReprovado!\n");
            }

            if (media >= 4 && media < 7) {
                System.out.println("\nFazer PS!\n");
            }

            System.out.print("Deseja sair? \n" +
                    "[1] Sair \n" +
                    "[2] Continuar\n" +
                    "--> ");
            comandoDeSaida = scan.nextInt();
        }
        doNothing(scan);
    }

    private static void doNothing(Scanner s) {}
}
