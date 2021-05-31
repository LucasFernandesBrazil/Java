package exercicios.Linguagem1.POO.exercicio5;

import java.util.Arrays;

public class Conjunto {
    private int vetor [];
    private int tamanho;

    public Conjunto() {
        this.vetor = new int[tamanho];
        this.tamanho = 4;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int [] inserirElemento (int x) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor [i] != x) {
                vetor [i] = x;
                return vetor;
            }
        }
        return vetor;
    }

    public boolean verificadorElemento (int x) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor [i] == x) {
                contador ++;
            }
            if (contador != 0) {
                return true;
            }
        }
        return false;
    }

    public int verificadorDePosicao (int x) {
        int posicao = -1;
        if (verificadorElemento(x) == true) {
            for (int i = 0; i < vetor.length; i++) {
                if (vetor [i] == x) {
                    posicao = i;
                }
            }
        }
        return posicao;
    }

    public int[] uniao (int x[]) {
        int aux[] = new int[x.length + vetor.length];
        int k = 0;
        for (int posicao = 0; posicao < (vetor.length); posicao++) {
            aux[posicao] = vetor[posicao];
            k++;
        }
        for (int posicao = 0; posicao < (x.length); posicao++) {
            if (!existe (x[posicao], aux, k)) {
                aux[k++] = x[posicao];
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

    public int[] inter (int x[]) {
        int aux[] = new int[x.length + vetor.length];
        int k = 0;

        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < vetor.length; j++){
                if (x[i] == vetor[j]) {
                    aux[k++] = x[i];
                }
            }
        aux = Arrays.copyOf(aux, k);
        return aux;
    }
    public int [] menos (int x[]) {
        int aux[] = new int[vetor.length];
        for (int i = 0; i < x.length; i++){
                aux [i] = vetor [i] - x [i];
            }
        return aux;
    }
}
