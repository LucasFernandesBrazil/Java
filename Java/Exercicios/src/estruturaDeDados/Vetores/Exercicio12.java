package Java.Exercicios.src.estruturaDeDados.Vetores;

import java.util.Arrays;

public class Exercicio12 {
    public static void main(String[] args) {
        /**
         * 12-Crie uma função que receba dois vetores A e B como parâmetros e no
         * final você deve retornar o vetor C resultado da intersecção entre A e B (operação de conjunto)
         */
        int A[] = {3, 5, 6, 10, 23, 4};
        int B[] = {3, 4, 2, 23};
        int C[] = funcaoInterseccao(A, B);

        //Printando o vetor C
        System.out.print("Vetor Intersecção C: ");
        System.out.print(Arrays.toString(C));
    }

    //Função de Intersecção dos vetores
    public static int[] funcaoInterseccao(int A[], int B[]) {
        int aux[] = new int[A.length + B.length];
        int k = 0;

        //Criando dois laços For para comparar os elementos de A e B
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B.length; j++){
                if (A[i] == B[j]) {
                    aux[k++] = A[i];
                }
            }

        aux = Arrays.copyOf(aux, k);
            return aux;
    }
}
