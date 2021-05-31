package exercicios.pilhas;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StaticStack pilhaTeste = new StaticStack(5);
        escreverPilha((pilhaTeste));
        pilhaTeste.reverse();
        lerPilha(pilhaTeste);
    }

    public static void escreverPilha (StaticStack pilha) {
        Scanner scan = new Scanner(System.in);

        for (int contador = 0; contador < pilha.length(); contador++) {
            System.out.print("Digite o elemento: ");
            pilha.push(scan.nextInt());
        }
    }

    public static void lerPilha (StaticStack x) {
        System.out.println("Pilha: ");
        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.pop());
        }
    }
}
