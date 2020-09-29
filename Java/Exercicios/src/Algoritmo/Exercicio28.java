package Java.Exercicios.src.Algoritmo;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero, opcao;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;

        System.out.print("Informe um número: ");
        numero = scan.nextInt();


        if (numero > 0 && numero < 25) {
            contador1 ++;
        }

            if (numero > 25 && numero < 50) {
                contador2 ++;
            }

                if (numero > 50 && numero < 75) {
                    contador3 ++;
                }

                    if (numero > 75 && numero < 100) {
                        contador4 ++;
                    }

        System.out.print("Deseja informar mais um número? " +
                "\n Digite um valor negativo para não" +
                "\n Digite 0 para sim" +
                "\n\n -->");
        opcao = scan.nextInt();


        while (opcao >= 0) {
            System.out.print("Informe um número: ");
            numero = scan.nextInt();


            if (numero > 0 && numero < 25) {
                contador1 ++;
            }

            if (numero > 25 && numero < 50) {
                contador2 ++;
            }

            if (numero > 50 && numero < 75) {
                contador3 ++;
            }

            if (numero > 75 && numero < 100) {
                contador4 ++;
            }

            System.out.print("Deseja informar mais um número? " +
                    "\n Digite um valor negativo para não" +
                    "\n Digite 0 para sim" +
                    "\n\n -->");
            opcao = scan.nextInt();

        }

        System.out.println("[0 - 25]: " + contador1 + " vezes");
        System.out.println("[26 - 50]: " + contador2 + " vezes");
        System.out.println("[51 - 75]: " + contador3 + " vezes");
        System.out.println("[76 - 100]: " + contador4 + " vezes");
        doNothing(scan);
    }

    private static void doNothing(Scanner s) {}
}
