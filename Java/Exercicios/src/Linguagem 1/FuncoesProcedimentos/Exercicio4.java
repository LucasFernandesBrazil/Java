package exercicios.Linguagem1.FuncoesProcedimentos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        System.out.println("Soma de todos os números do 0 ao "+numero+": " + somadorDeNumero(numero));
    }

    public static int somadorDeNumero (int x) {
        int aux = 0;
        for (int i = 0; i <= x; i++) {
                aux = aux + i;
        }
        return aux;
    }
}
