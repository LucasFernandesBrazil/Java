package exercicios.Linguagem1.FuncoesProcedimentos;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        System.out.println(numero+"! = " + fatorialResultado(numero));
    }

    public static int fatorialResultado (int x) {
        int resultado = 1;
        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                resultado = resultado * i;
            }
        }
        if (x < 0) {
            resultado = -1;
        }
        return resultado;
    }
}
