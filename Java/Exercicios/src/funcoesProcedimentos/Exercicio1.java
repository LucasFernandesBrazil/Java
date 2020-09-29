package Java.Exercicios.src.funcoesProcedimentos;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int idade = scan.nextInt();
        System.out.println("\nCategoria:\n\n" + categoriaNadador(idade));
    }

    public static String categoriaNadador (int x) {
        String categoria = null;
        if (x >= 0 && x <= 4) {
            categoria = "=-==-=-== Não Qualificado =-==-=-==";
        }
        if (x >= 5 && x <= 7) {
            categoria = "=-==-=-== Infantil A =-==-=-==";
        }
        if (x >= 8 && x <= 10) {
            categoria = "=-==-=-== Infantil B =-==-=-==";
        }
        if (x >= 11 && x <= 13) {
            categoria = "=-==-=-== Juvenil A =-==-=-==";
        }
        if (x >= 14 && x <= 17) {
            categoria = "=-==-=-== Juvenil B =-==-=-==";
        }
        if (x >= 18) {
            categoria = "=-==-=-== Adulto =-==-=-==";
        }
        return categoria;
    }
}
