package Java.Exercicios.src.estruturaDeDados.Vetores;

import java.util.Arrays;

public class Exercicio11 {
    public static void main(String[] args) {
        /**
         * 11-Crie uma função que receba dois vetores A e B como parâmetros e no
         * final você deve retornar o vetor C resultado da união entre A e B (operação de conjunto)
         */
        int A[] = {5, 3, 6, 10, 1};
        int B[] = {3, 4, 1, 22};
        int C[] = funcaoUniao(A, B);

        //Printando o Vetor C
        System.out.print("Vetor união C: ");
        System.out.print(Arrays.toString(C));
    }

    //Função de união dos vetores
    public static int[] funcaoUniao(int A[], int B[]) {
        int aux[] = new int[A.length + B.length];
        int k = 0;

        //Transferindo os valores de A para o vetor auxiliar
        for (int posicao = 0; posicao < (A.length); posicao++) {
            aux[posicao] = A[posicao];
            k++;
        }

        //Transferindo os valores de B para o vetor auxiliar e verificando se possui valores iguais
        for (int posicao = 0; posicao < (B.length); posicao++) {
            if (!existe (B[posicao], aux, k)) {
                aux[k++] = B[posicao];
            }
        }
        aux = Arrays.copyOf(aux, k);
        return aux;
    }

    private static boolean existe (int x, int aux [], int k) {
        for (int i = 0; i < k; i++ ){
            if (aux[i] == x)
                return true;
        }
        return false;
    }

}