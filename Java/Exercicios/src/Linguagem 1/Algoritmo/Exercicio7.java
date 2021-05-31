package exercicios.Linguagem1.Algoritmo;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        double temp, F;


        System.out.print("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                "C O N V E R S O R   DE  T E M P E R A T U R A \n" +
                "=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                "\n\n");

        System.out.print ("Digite o valor da temperatura [°C] ->  ");
        temp = scan.nextDouble();

        F = (9 * temp + 160) / 5;

        System.out.print("A temperatura de " + temp + "°C equivale a "+ F + "°F");
    }

}
