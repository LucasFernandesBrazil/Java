package exercicios.pilhas;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o tamanho da pilha 1: ");
        int tamanho = scan.nextInt();
        StaticStack pilha1 = new StaticStack(tamanho);
        System.out.print("Informe o tamanho da pilha 2: ");
        int tamanho2 = scan.nextInt();  
        StaticStack pilha2 = new StaticStack(tamanho2);
        System.out.println("Pilha 1: ");
        leitorDePilha(pilha1);
        System.out.println("Pilha 2: ");
        leitorDePilha(pilha2);

        System.out.println("Pilhas são iguais? " + validarSeIguais(pilha1, pilha2) );

    }

    public static void leitorDePilha (StaticStack pilha) {
        Scanner scan = new Scanner(System.in);

        for (int contador = 0; contador < pilha.length(); contador++) {
            System.out.print("Digite o elemento: ");
            pilha.push(scan.nextInt());
        }
    }

    public static boolean validarSeIguais (StaticStack pilha1, StaticStack pilha2) {

        if (pilha1.length() != pilha2.length()) {
            return false;
        }

        while(!pilha1.isEmpty() && !pilha2.isEmpty()) {
            int elementoPilha1 = pilha1.pop();
            int elementoPilha2 = pilha2.pop();
            if (elementoPilha1 != elementoPilha2) {
                return false;
            }
        }
        return true;
    }
}
