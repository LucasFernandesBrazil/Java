package Java.Exercicios.src.funcoesProcedimentos;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número correspondente a um mês: ");
        int mes = scan.nextInt();
        System.out.print(mes + " corresponde ao mês: ");
        leitorMes(mes);
    }

    static void leitorMes (int x) {
        if (x < 1 || x > 12) {
            System.out.println("Error! Mês não encontrado!");
        }
        else if (x == 1) {
            System.out.println("Janeiro");
        }
        else if (x == 2) {
            System.out.println("Fevereiro");
        }
        else if (x == 3) {
            System.out.println("Março");
        }
        else if (x == 4) {
            System.out.println("Abril");
        }
        else if (x == 5) {
            System.out.println("Maio");
        }
        else if (x == 6) {
            System.out.println("Junho");
        }
        else if (x == 7) {
            System.out.println("Julho");
        }
        else if (x == 8) {
            System.out.println("Agosto");
        }
        else if (x == 9) {
            System.out.println("Setembro");
        }
        else if (x == 10) {
            System.out.println("Outubro");
        }
        else if (x == 11) {
            System.out.println("Novembro");
        }
        else if (x == 12) {
            System.out.println("Dezembro");
        }
    }
}
