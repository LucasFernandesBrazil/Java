package Java.Exercicios.src.funcoesProcedimentos;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = scan.nextInt();
        System.out.println("Menor número: " + menorNumero(numero, numero2));
    }

    public static int menorNumero (int x, int y) {
        int aux = x;
        if (y < aux) {
            aux = y;
        }
        return aux;
    }
}
