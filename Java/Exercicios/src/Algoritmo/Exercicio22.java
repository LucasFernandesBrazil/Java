package Java.Exercicios.src.Algoritmo;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.print("Informe um número: ");
        numero = scan.nextInt();

        for (int i = 1; i < numero; i++){
            System.out.println(i);
        }
        doNothing(scan);
    }

    private static void doNothing(Scanner s) {}
}
