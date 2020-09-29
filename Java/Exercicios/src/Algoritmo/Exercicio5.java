package Java.Exercicios.src.Algoritmo;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double pao = 0.33;
        double broa = 0.87;
        double total;
        double poupanca;
        int Quantidade;

        System.out.print("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                         "   C A L C U L A D O R  DE  R E N D A \n" +
                         "=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                         "\n\n");

        System.out.print ("Informe a Qntd. de pães vendidos hoje: ");
        Quantidade = scan.nextInt();
        total = Quantidade * pao;

        System.out.print ("Informe a Qntd. de broas vendidas hoje: ");
        Quantidade = scan.nextInt();
        total = total + (Quantidade * broa);

        //Calculando 10% do valor total
        poupanca = 0.10 * total;
        LimparTela();
        System.out.print("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                " Valor Bruto faturado:  R$"+ total + "\n" +
                "Valor a ser investido na poupança: R$" + Math.round(poupanca) + "\n" +
                "=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=\n" +
                "\n\n");
        doNothing(scan);
     }
        
    private static void doNothing(Scanner s) {}
    //Método para limpar a tela
    public static void LimparTela () {
        System.out.print ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
