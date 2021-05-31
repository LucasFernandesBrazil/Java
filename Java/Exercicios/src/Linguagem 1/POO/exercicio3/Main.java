package exercicios.Linguagem1.POO.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o dia: ");
        int dia = scan.nextInt();
        System.out.print("Informe o mês: ");
        int mes = scan.nextInt();
        System.out.print("Informe o ano: ");
        int ano = scan.nextInt();
        try {
            int opcao = 5;
            while (opcao != 4) {
                Data data = new Data(dia, mes, ano);
                System.out.print("\n=-==-=Digite uma opção: =-==-=" +
                                 "\n      Formatar data [1]" +
                                 "\n      Pular um dia  [2]" +
                                 "\n      Nova data     [3]" +
                                 "\n      Finalizar     [4]" +
                                 "\n=-==-==-==-=-==-=-==-=-==-=-==" +
                                 "\n\n --> ");
                opcao = scan.nextInt();
                if (opcao == 1) {
                    System.out.println("\n"+data.toString()+"\n");
                }
                if (opcao == 2) {
                    System.out.println("\n"+data.avancarData()+"\n");
                }
                if (opcao == 3) {
                    System.out.print("\nInforme o dia: ");
                    dia = scan.nextInt();
                    System.out.print("Informe o mês: ");
                    mes = scan.nextInt();
                    System.out.print("Informe o ano: ");
                    ano = scan.nextInt();
                    data.setAno(ano);
                    data.setMes(mes);
                    data.setDia(dia);
                }
            }
            System.out.println("\nObrigado por utilizar nosso sistema! ");
        }
        catch (Exception a){
            System.out.println("Error");
            a.getMessage();
            a.printStackTrace();
        }

    }
}
