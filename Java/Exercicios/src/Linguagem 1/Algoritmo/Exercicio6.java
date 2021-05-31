package exercicios.Linguagem1.Algoritmo;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int  N1, N2, soma, total;

        System.out.print ("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                "C A L C U L A D O R  DE  P O T Ê N C I A Ç Ã O \n" +
                "=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                "\n\n");


        System.out.print ("Digite o primeiro valor: ");
        N1 = scan.nextInt();
        System.out.print ("Digite o segundo valor: ");
        N2 = scan.nextInt();

        soma = N1 + N2;
        total = soma*soma;

        System.out.print ("\n O resultado do quadrado da soma dos valores é: " + total);

    }
}
