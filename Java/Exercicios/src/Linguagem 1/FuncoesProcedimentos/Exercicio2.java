package exercicios.Linguagem1.FuncoesProcedimentos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        System.out.println("Este número é par: " );
        booleanReader(verificadorValorPar(numero));
        System.out.println("Este número é ímpar: ");
        booleanReader(verificadorValorImpar(numero));

    }

    public static boolean verificadorValorPar (int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean verificadorValorImpar (int x) {
        if (x % 2 != 0) {
            return true;
        }
        return false;
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
