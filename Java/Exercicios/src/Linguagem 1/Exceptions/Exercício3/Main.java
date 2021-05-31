package exercicios.Linguagem1.Exceptions.Exercício3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            try {
                System.out.println("Divisão:");
                System.out.print("Informe o primeiro valor: ");
                int x = teclado.nextInt();
                System.out.print("Informe o segundo valor: ");
                int y = teclado.nextInt();
                double r = (x / y);
                System.out.println("O resultdo da soma é " + r);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=" +
                        "\n                 ERROR! \n->Código do erro: 001 \nNão é possível realizar divisões por 0" +
                        "\n=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-= ");
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=" +
                        "\n                 ERROR! \n->Código do erro: 002 \nVocê digitou letras ao invés de números" +
                        "\n=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-= ");
                teclado.next();
            }
        }
    }