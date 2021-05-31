package exercicios.Linguagem1.Algoritmo;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A, B, C;

        System.out.print("Digite o valor de A: ");
        A = scan.nextInt();

        System.out.print("Digite o valor de B: ");
        B = scan.nextInt();

        System.out.print("Digite o valor de C: ");
        C = scan.nextInt();

        if ((A + B) < C) {
            System.out.println("A soma de A e B é menor que C");
        }
        else {
            System.out.println("A soma de A e B é maior que C");
        }
    }
}
