package Java.Exercicios.src.Algoritmo;


import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você deseja digitar? ");

        int numero = scan.nextInt();

        int posicoes = numero;
        int vetorValores [] = new int[posicoes];
        int Maior = 0;
        int Menor = 0;


        //Recebendo valores para o vetor e verificando os valores Maior e Menor
        for (int i = 0; i < vetorValores.length; i++) {
            System.out.print("Digite o valor ["+ i +"]: ");
            vetorValores [i] = scan.nextInt();
            if (i == 0){
                Maior = vetorValores[i];
                Menor = vetorValores[i];
            }

            if (vetorValores [i] > Maior) {
                Maior = vetorValores [i];
            }

            if (vetorValores [i] < Menor) {
                Menor = vetorValores [i];
            }
        }

        System.out.println("Valor maior: " + Maior);
        System.out.println("Valor menor: " + Menor);

        doNothing(scan);
    }

    private static void doNothing(Scanner s) {}
}
