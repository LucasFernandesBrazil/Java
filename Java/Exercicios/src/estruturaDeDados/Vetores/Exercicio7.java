package Java.Exercicios.src.estruturaDeDados.Vetores;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        /**
         * 7- Fazer um programa para ler 8 valores e, em seguida, mostrar
         * a posição onde se encontram o maior e o menor valor.
         */
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[8];
        System.out.println("Informe os valores de cada posição do Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição [" + i + "] = ");
            vetor[i] = scan.nextInt();
        }
        int maior = indentificandoValorMaior(vetor);
        int menor = indentificandoValorMenor(vetor);
        System.out.println("Maior valor: "+ maior);
        System.out.println("Menor valor: "+ menor);
    }

        //INDENTIFICANDO MAIOR VALOR:
        public static int indentificandoValorMaior ( int vetor[]) {
            int valorMaior = 0;
            for (int leitor = 0; leitor < vetor.length; leitor++) {
                if (leitor == 0) {
                    valorMaior = vetor[0];
                }
                if (vetor[leitor] >= valorMaior) {
                    valorMaior = vetor[leitor];
                }
            }
            return valorMaior;
        }
        //INDENTIFICANDO MENOR VALOR:
        public static int indentificandoValorMenor ( int vetor[]){
            int valorMenor = 0;
            for (int leitor = 0; leitor < vetor.length; leitor++) {

                if (leitor == 0) {
                    valorMenor = vetor[0];
                }
                if (vetor[leitor] < valorMenor) {
                    valorMenor = vetor[leitor];
                }
            }
            return valorMenor;
        }
}
