package Java.Exercicios.src.estruturaDeDados.Vetores;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vetor [] = new int[15];

        System.out.println ("Informe os valores de cada posição do Vetor: ");

            for (int i = 0; i < vetor.length; i++ ){
                System.out.print ("["+i+"]= ");
                vetor [i] = scan.nextInt();
            }
            System.out.print("Informe o valor de X: ");
            int X = scan.nextInt();
            System.out.print ("Informe o valor de Y: ");
            int Y = scan.nextInt();

            while (X > 15 || Y > 15) {
                System.out.println("Posições inválidas!");
                System.out.println("Digite posições válidas:");
                System.out.print("Informe o valor de X: ");
                X = scan.nextInt();
                System.out.print ("Informe o valor de Y: ");
                Y = scan.nextInt();
            }
            if (X < 15 && Y < 15) {
                int SOMA = vetor[X] + vetor[Y];
                System.out.println("A soma da posição [" + X + "]{" + vetor[X] + "} + ["
                + Y + "]{" + vetor[Y] + "} é igual a: " + SOMA);
            }
    }
}
