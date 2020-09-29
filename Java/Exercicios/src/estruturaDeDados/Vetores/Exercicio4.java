package Java.Exercicios.src.estruturaDeDados.Vetores;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /**
         * Crie uma função que você passa um array e uma posição
         * por parâmetro e ele retorna o elemento da posição.
         * Se posição inválida, informar ao usuário: “Posição inválida”*/

        Scanner scan = new Scanner(System.in);

        System.out.print ("Digite o número de posições do array: ");
        int posicao = scan.nextInt();

        int vetor [] = new int [posicao];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print ("Informa o valor de ["+ i + "]: ");
            vetor [i] = scan.nextInt ();
        }
        for (int leitura = 0; leitura < vetor.length; leitura++) {
            System.out.println("["+leitura+"]: "+ vetor[leitura]);
        }
    }
}
