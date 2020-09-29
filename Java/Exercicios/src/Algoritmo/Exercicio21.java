package Java.Exercicios.src.Algoritmo;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        double salario, imposto;

        System.out.print("Informe seu nome: ");
        nome = scan.next();

        System.out.print("Informe seu salário: R$");
        salario = scan.nextInt();

        if (salario <= 1500) {
            System.out.println("Você está isento de impostos!");
        }

            if (salario > 1500 && salario <= 2500) {
                imposto = salario * 0.15;
                System.out.println("Valor total de imposto de renda a pagar: R$" + imposto);
            }

                if (salario > 2500 && salario <= 4000) {
                    imposto = salario * 0.275;
                    System.out.println("Valor total de imposto de renda a pagar: R$" + imposto);
                }

                    if (salario > 4000) {
                        imposto = salario * 0.35;
                        System.out.println("Valor total de imposto de renda a pagar: R$" + imposto);
                    }
        System.out.println("Obrigado por sua contribuição, " + nome);
        doNothing(scan);
    }

    private static void doNothing(Scanner s) {}
}
