package exercicios.Linguagem1.FuncoesProcedimentos;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva a base da potência: ");
        int base = scan.nextInt();
        System.out.print("Escreva o expoente da potência: ");
        int expoente = scan.nextInt();
        System.out.println("O resultado da potência é: " + potencia(base, expoente));

    }

    public static int potencia (int base, int expoente) {
        int resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }
}
