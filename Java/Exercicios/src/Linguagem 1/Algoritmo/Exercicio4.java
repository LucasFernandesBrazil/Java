package exercicios.Linguagem1.Algoritmo;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int anos, meses, dias, total;

        System.out.print("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                "    C A L C U L A D O R  DE  D I A S \n" +
                "=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                "\n\n");

        System.out.println("Digite sua idade: ");

        System.out.print ("Anos: ");
        anos = scan.nextInt();

        System.out.print    ("Meses: ");
        meses = scan.nextInt();

        System.out.print ("Dia: ");
        dias = scan.nextInt();

        //Convertendo anos e meses em dias
        anos = anos*365;
        meses = meses*30;

        total = anos + meses + dias;

        System.out.print ("Você tem aproxidamente " + total + " dias de vida! ");
    }
}