package Java.Exercicios.src.Algoritmo;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A, B, C;

        System.out.print("Digite o valor de A: ");
        A = scan.nextInt();

        System.out.print("Digite o valor de B: ");
        B = scan.nextInt();

        if (A == B) {
            C = A + B;
            System.out.println("A soma entre A e B é: "+ C);
        }
        else {
            C = A * B;
            System.out.println("A multiblicado por B é: "+ C);
        }
        doNothing(scan);
    }

    private static void doNothing(Scanner s) {}
}
