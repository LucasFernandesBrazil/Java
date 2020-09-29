package Java.Exercicios.src.estruturaDeDados.Vetores;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        /**
         * 8- Crie um algoritmo que recebe um array de inteiros X e um valor inteiro Y e retorna a
         * quantidade de vezes que Y aparece no array X
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor de X: ");

        int X = scan.nextInt();
        int vetor[] = new int[X];
        System.out.println("Informe os valores de cada posição do Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + i + "]= ");
            vetor[i] = scan.nextInt();
        }
        System.out.print("Informe o valor de Y: ");
        int Y = scan.nextInt();

        //Verificando o número de repetições de Y dentro do Array
        int valoresIguais = 0;
        for (int leitor = 0; leitor < vetor.length; leitor ++) {
            if (vetor[leitor] == Y) {
                valoresIguais = valoresIguais+1;
            }
        }

        if (valoresIguais == 0) {
            System.out.println("O valor Y("+Y+") não apareceu no Array X");
        }
        else {
            System.out.println("O valor Y("+Y+") apareceu "+valoresIguais+" vezes no Array X");
        }
    }
}