package exercicios.pilhas;


import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        StaticStackChar pilha = null;
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva uma cadeia de caracteres: ");
        String cadeia1 = scan.next();
        pilha = new StaticStackChar(cadeia1.length());
        leitorDePilha(cadeia1, pilha);


        System.out.print("Escreva outra cadeia de caracteres: ");
        String cadeia2 = scan.next();


        System.out.print(verificadorDeArbitrarios(cadeia1, cadeia2, pilha));

    }

    public static void leitorDePilha (String x, StaticStackChar pilha) {

        char letra;

        for (int contador = 0; contador < pilha.length(); contador++) {
            letra = x.charAt(contador);
            pilha.push(letra);
        }

    }

    public static boolean verificadorDeArbitrarios (String x, String y, StaticStackChar pilha) {
        char aux;


        if (x.length() != y.length()) {
            return false;
        }

        for (int contador = 0; contador < 4; contador++) {
            char letra = pilha.pop();
            aux = y.charAt(contador);
            if (aux != letra) {
                return false;
            }
        }
        return true;
    }
}
