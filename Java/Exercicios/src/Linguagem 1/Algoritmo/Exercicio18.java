package exercicios.Linguagem1.Algoritmo;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        double P1, P2, media;

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
    }
}
