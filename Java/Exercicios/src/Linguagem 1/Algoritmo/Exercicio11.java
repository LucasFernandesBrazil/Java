package exercicios.Linguagem1.Algoritmo;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double valor1, valor2;

        System.out.print("Digite um valor: ");
        valor1 = scan.nextDouble();

        System.out.print("Digite um valor: ");
        valor2 = scan.nextDouble();

        if (valor1 >= 0 && valor2 >= 0) {
            System.out.println("Valores são válidos!");
        }
        else {
            System.out.println("Valores inválidos!");
        }
    }
}
