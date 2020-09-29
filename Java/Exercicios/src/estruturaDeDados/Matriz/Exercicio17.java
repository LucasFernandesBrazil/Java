package Java.Exercicios.src.estruturaDeDados.Matriz;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        //Criação das variáveis de cálculo
        int partida = 0;
        int destino = 0;
        double distancia;
        double distanciaProxima;
        double distanciaProxima2;
        double distancia2;


        //Criação de um variável tipo Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("---------------\n" +
                "|   Cidades:  |\n" +
                "---------------\n" +
                "|[0] Cárceres;|\n" +
                "|[1] BBurgres;|\n" +
                "|[2] Cuiabá;  |\n" +
                "|[3] VGrande; |\n" +
                "|[4] Tangará; |\n" +
                "|[5] PLacerda;|\n" +
                "|[6]   Sair   |\n" +
                "---------------");


        //Criando uma matriz 6x6
        //Iniciando a matriz com os valores
        //Linha x Coluna
        final int cidades[][] = new int[7][7];
            cidades[0][0] = -1;
            cidades[0][1] = 63;
            cidades[0][2] = 210;
            cidades[0][3] = 190;
            cidades[0][4] = 0;
            cidades[0][5] = 190;
            cidades[1][0] = 63;
            cidades[1][1] = -1;
            cidades[1][2] = 160;
            cidades[1][3] = 150;
            cidades[1][4] = 95;
            cidades[1][5] = 0;
            cidades[2][0] = 210;
            cidades[2][1] = 160;
            cidades[2][2] = -1;
            cidades[2][3] = 10;
            cidades[2][4] = 0;
            cidades[2][5] = 0;
            cidades[3][0] = 190;
            cidades[3][1] = 150;
            cidades[3][2] = 10;
            cidades[3][3] = -1;
            cidades[3][4] = 0;
            cidades[3][5] = 0;
            cidades[4][0] = 0;
            cidades[4][1] = 95;
            cidades[4][2] = 0;
            cidades[4][3] = 0;
            cidades[4][4] = -1;
            cidades[4][5] = 80;
            cidades[5][0] = 190;
            cidades[5][1] = 0;
            cidades[5][2] = 0;
            cidades[5][3] = 0;
            cidades[5][4] = 80;
            cidades[5][5] = -1;
            cidades[6][6] = 10000000;

            //Buscando valor da distância
            distancia = cidades[destino][partida];


            //Iniciando uma estrutura condicional "Enquanto"
            while (distancia != 10000000) {
                System.out.println("Digite o número correspondente da cidade de partida e o destino:");
                System.out.print("Cidade de partida: ");
                partida = scan.nextInt(); //lendo o valor de partida


                System.out.print("Cidade de destino: ");
                destino = scan.nextInt(); //Lendo o valor do destino

                distancia = cidades[destino][partida];

                //Calculando distancia
                if (distancia == 0) {
                    distanciaProxima = cidades[partida][partida + 1];
                    distanciaProxima2 = cidades[partida + 1][destino];
                    distancia2 = distanciaProxima + distanciaProxima2;

                    System.out.println("A distância será de: " + distancia2);

                } else if (partida == destino) {
                    System.out.println("A distância entre uma cidade e ela mesmo é igual a 0!");
                } else {
                    System.out.println("A distância é de: " + distancia);
                }

            }
            //limpando console
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nObrigado por utilizar nosso programa!");

        }
    }