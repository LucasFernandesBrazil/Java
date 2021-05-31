package exercicios.Linguagem1.Algoritmo;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        double entradaAltura, pesoIdeal;
        char entradaSexo;

        System.out.print("Informe sua altura: ");
        entradaAltura = scan.nextDouble();

        System.out.print("Informe seu sexo [M/F]: ");
        entradaSexo = scan.next().toUpperCase().charAt(0);


            if (entradaSexo == 'M' || entradaSexo == 'm') {
                pesoIdeal = (72.7 * entradaAltura) - 58;
                System.out.println("Seu peso ideal é de: " + Math.round(pesoIdeal) + "Kg");
            }
            if (entradaSexo == 'F' || entradaSexo == 'f') {
                pesoIdeal = (62.1 * entradaAltura) - 44.7;
                System.out.println("Seu peso ideal é de: " + Math.round(pesoIdeal) + "Kg");
            }

    }
}
