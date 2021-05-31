package exercicios.Linguagem1.Exceptions.Exercício2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String resultado = null;
        while (resultado == null) {
            try {
                System.out.println("Eu sei dividir!");
                System.out.print("Informe o primeiro valor: ");
                int x = teclado.nextInt();
                System.out.print("Informe o segundo valor: ");
                int y = teclado.nextInt();
                double r = (x / y);
                resultado= Integer.toString((int) r);
                System.out.println("O resultdo da soma é " + r);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=" +
                        "\n                 ERROR! \n->Código do erro: 001 \nNão é possível realizar divisões por 0" +
                        "\n=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-= \nTente novamente: ");
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=" +
                        "\n                 ERROR! \n->Código do erro: 002 \nVocê digitou letras ao invés de números" +
                        "\n=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-= \nTente novamente: ");
                teclado.next();
            }
        }
    }
}
