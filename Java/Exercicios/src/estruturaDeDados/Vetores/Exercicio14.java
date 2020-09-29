package Java.Exercicios.src.estruturaDeDados.Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        /**
         * 14-Escreva um algoritmo que leia um vetor de 15 posições
         * e o compacte,ou seja,elimine as posições com valor zero.
         * Para isso,todos os elementos à frente do valor zero,devem
         * ser movidos uma posição para trás no vetor.
         */
        int A[] = new int[15];

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe os valores de cada posição do Vetor: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Posição [" + i + "] = ");
            A[i] = scan.nextInt();
        }
        int C[] = funcaoDiferenca(A);
        //Printando o vetor C
        System.out.print("Vetor compactado de A: ");
        System.out.print(Arrays.toString(C));
    }

    //Função para verificar elementos 0
    public static int[] funcaoDiferenca(int A[]) {
        int aux[] = new int[A.length];
        int k = 0;

        //Verificando se o A possui valores 0 e excluindo-os
        for (int i = 0; i < A.length; i++){
                if (A[i] != 0) {
                    aux[k++] = A[i];
                }
            }

        // Criando um vetor com o tamanho novo de A
        int C [] = new int [k];
        for (int i = 0; i < k; i++) {
            C[i] = aux[i];
        }
        return C;
    }
}
