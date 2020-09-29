package Java.Exercicios.src.Algoritmo;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.print("Escreva um número: ");
        numero =scan.nextInt();

        if (numero%2 == 0) {
            System.out.println(numero + " é par!");
        }
        else {
            System.out.println(numero + " é ímpar!");
        }
        scan.close ();
    }
}
