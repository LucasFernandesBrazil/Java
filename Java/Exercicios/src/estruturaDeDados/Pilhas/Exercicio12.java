package exercicios.pilhas;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*** Bem vindo(a) ao verificador de fórmulas!! ***" +
                "\nDigite uma fórmula ->");
        String formula = scan.nextLine();
        verificarFormula(formula);
    }

    public static void verificarFormula(String x) {
        StaticStackChar verificador = new StaticStackChar (x.length());
        char pop;
        char abre = '(';
        char fecha = ')';
        int cont = 0;
        for (int i = 0; i < x.length(); i++) {
            verificador.push(x.charAt(i));
        }
        for (int i = 0; i < verificador.length(); i++) {
            pop = verificador.pop();
            if (pop == abre) {
                cont++;
            }
            if (pop == fecha) {
                cont++;
            }
        }
        if (cont % 2 == 0) {
            System.out.print("Fórmula bem estruturada! ");
        }
        if (cont % 2 != 0) {
            System.out.print("Fórmula mal estruturada! ");
        }
    }
}
