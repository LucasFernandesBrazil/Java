package exercicios.Linguagem1.FuncoesProcedimentos;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        System.out.print(numero+ " é um número primo: ");
        booleanReader(numeroPrimo(numero));
    }

    public static boolean numeroPrimo (int x) {
        int aux = 0;
        if (x == 1) {
            aux++;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                aux++;
            }
        }
        if (aux != 0) {
            return false;
        }
        return true;
    }

    public static void booleanReader (boolean x) {
        if (x == true) {
            System.out.println("Verdadeiro! ");
        }
        if (x == false) {
            System.out.println("Falso! ");
        }
    }
}
