package exercicios.Linguagem1.FuncoesProcedimentos;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o raio da esfera [metros]: ");
        double raio = scan.nextInt();
        System.out.println("Volume da esfera: " + calculoVolumeEsfera(raio) + " metros cúbicos");
    }

    public static double calculoVolumeEsfera (double x) {
        double volume;

        volume = (4 * 3.14 * (x*x*x)) / 3;
        return volume;
    }
}
