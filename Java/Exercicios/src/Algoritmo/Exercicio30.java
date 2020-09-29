package Java.Exercicios.src.Algoritmo;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Digite um número para ser calculado seu fatorial: ");
        n = scan.nextInt();

        if (n == 1 || n == 0) {
            System.out.println(n + "! = 1");
        }

            if (n < 0) {
                System.out.println(n + "! = Inexistente");
            }


                else {
                    System.out.println(n+ "! = " + fatorial(n));
                }
        doNothing(scan);
    }
        
    private static void doNothing(Scanner s) {}

    public static int fatorial ( int x ) {

        int vetorX [] = new int[x+1];
        int aux = 1;

        for (int i = 1; i < vetorX.length ; i++) {
            aux = aux * i;
        }
        return aux;
    }
}
