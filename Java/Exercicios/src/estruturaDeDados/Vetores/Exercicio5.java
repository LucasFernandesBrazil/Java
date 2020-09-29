package Java.Exercicios.src.estruturaDeDados.Vetores;

public class Exercicio5 {
    public static void main(String[] args) {
/** 5 - Escreva programa que possua um vetor denominado A
 que armazene 6 números inteiros. O programa deve executar os seguintes passos:
● Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
● Armazene em uma variável inteira a soma entre os valores das posições A[0], A[1] e
 A[5] do vetor e mostre na tela esta soma.
● Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
 ● Mostre na tela cada valor do vetorA, um em cada linha. */
    int A [] = new int[]{1, 0, 5, -2, -5, 7};
    int SOMA = A[0] + A[1] + A [5];
    System.out.println("A soma entre A[0]{"+ A[0]+"} + A[1]{"+ A[1] + "} + A[5]{" +
            +A[5] +"} é: "+ SOMA);
    A [4] = 100;
    for (int i=0; i < A.length; i++){
    System.out.println("["+i+"] = "+ A [i]);
    }
    }
}
