package exercicios.Linguagem1.FuncoesProcedimentos;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("=-==- Informe uma sequência de números para obter a média artmédica dos mesmos -==-=");
        System.out.println("Digite [0] encerrar" +
                "\nInforme um número -> ");
        int numero = scan.nextInt();
        double mediaAritimedica = valorAritmedico(numero);
        System.out.println("Media aritmédica: " + mediaAritimedica);
    }

    public static double valorAritmedico(int numero) {
        double media = 0;
        int elemento = numero;
        int soma = numero;
        int contador = 0;
        Scanner scan = new Scanner(System.in);
        while (elemento != 0) {
            System.out.print("\nDigite [0] encerrar" +
                    "\nInforme um número -> ");
            elemento = scan.nextInt();
            soma = soma + elemento;
            contador++;
        }
        media = soma / contador;
        return media;
    }
}
