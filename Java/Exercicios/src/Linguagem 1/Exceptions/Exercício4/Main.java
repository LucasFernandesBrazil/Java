package exercicios.Linguagem1.Exceptions.Exercício4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Informe um número maior ou igual a 10: ");
            int numero = scan.nextInt();
            validacao(numero);
            System.out.println("O número verificado com sucesso!");
        }
        catch (NumeroAbaixoDe10Exception numeroAbaixoDe10Exception) {
            System.out.println(numeroAbaixoDe10Exception.getMessage());
        }
    }

    public static void validacao (int x) throws NumeroAbaixoDe10Exception {
        if (x < 10) {
            throw new NumeroAbaixoDe10Exception(x);
        }
    }
}