package exercicios.Linguagem1.Exceptions.Exercício5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0, contador = 0;
        int numero;
        try {
            System.out.print("Informe um número: ");
            numero = scan.nextInt();
            soma = numero;
            while (true) {
                System.out.print("Informe outro número: ");
                numero = scan.nextInt();
                soma = soma + numero;
                if (soma >= 100) {
                    throw new ExcecaoAcimaDeCem(numero, soma);
                }
                contador++;
            }
        }
        catch (ExcecaoAcimaDeCem excecaoAcimaDeCem) {
            System.out.println(excecaoAcimaDeCem.getMessage());
            soma = excecaoAcimaDeCem.soma;
        }
        catch (ArithmeticException arithmeticException) {
            System.out.println("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=" +
                    "\n                 ERROR! \n->Código do erro: 001 \nNão é possível realizar divisões por 0" +
                    "\n=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=");
            System.exit(0);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=" +
                    "\n                 ERROR! \n->Código do erro: 002 \nVocê digitou letras ao invés de números" +
                    "\n=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-= ");
            scan.next();
            System.exit(0);
        }

        System.out.println("Soma -> " + soma);
        System.out.println("Números somados: " + contador);
        System.out.println("Média aritmédica: " + soma / (contador+1));
    }
}
