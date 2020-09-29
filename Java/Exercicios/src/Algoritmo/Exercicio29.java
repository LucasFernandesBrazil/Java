package Java.Exercicios.src.Algoritmo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número de elementos: ");
        int elementos = scan.nextInt();

        int vetorFibonacci [] = new int[elementos];

        System.out.println(Arrays.toString(fibonacci(vetorFibonacci)));
        doNothing(scan);
    }

    private static void doNothing(Scanner s) {}

    public static int [] fibonacci (int x[]) {

        for (int i = 0; i < x.length; i++) {

            if (i == 0) {
                x [i] = 1;
            }

                if (i == 1) {
                    x[i] = 1;
                }

                    if (i >= 2) {
                        x [i] = x[i-1] + x[i-2];
                    }
        }
        return x;
    }
}
