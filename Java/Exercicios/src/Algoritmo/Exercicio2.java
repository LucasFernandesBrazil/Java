package Java.Exercicios.src.Algoritmo;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float N1, N2, D;

        System.out.print ("Digite o primeiro valor: ");
        N1 = scan.nextInt();
        System.out.print ("Digite o segundo valor: ");
        N2 = scan.nextInt();

        while (N2 == 0) {
            System.out.print ("Não é possível fazer uma divisão por 0");
            System.out.print ("Digite novamente  o segundo valor: ");
            N2 = scan.nextInt();
        }

        D = N1/N2;

        System.out.print ("O resultado da divisão é: " +  D);
        doNothing(scan);
    }

    private static void doNothing(Scanner s) {
	
	}
}
