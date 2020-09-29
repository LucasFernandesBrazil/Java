package Java.Exercicios.src.Algoritmo;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double peso, altura;
        double IMC;

        System.out.println("Informe seu peso [Quilos]: ");
        peso = scan.nextDouble();

        System.out.println("Informe sua altura [Metros]: ");
        altura = scan.nextDouble();

        IMC = peso/(altura*altura);

        LimparTela();

        if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso!");
        }

        if (IMC > 18.5 && IMC < 25) {
            System.out.println("Você se encontra com o peso normal, parabéns!!");
        }

        if (IMC > 25 && IMC < 30) {
            System.out.println("Você está acima do peso!");
        }
        if (IMC > 30) {
            System.out.println("Você está na condição 'OBESO'! ");
        }
        doNothing(scan);
    }

    private static void doNothing(Scanner s) {}
    private static void LimparTela () {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
