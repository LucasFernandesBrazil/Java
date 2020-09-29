package Java.Exercicios.src.estruturaDeDados.Vetores;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        /**
         * 10- Foi realizada uma pesquisa de algumas características físicas de 50 habitantes de uma
         * certa região. De cada habitante foram coletados os seguintes dados: gênero, cor dos olhos
         * (azuis, verdes ou castanhos), cor dos cabelos (louros, pretos ou castanhos) e idade. Faça
         * um algoritmo que crie e leia do usuário os seguintes valores e insira em cadas respectivo
         * vetor:
         * Estrutura de Dados 1
         * Vetores
         * ● genero: tipo char que armazena ‘f’ para femino e ‘m’ para masculino
         * ● olhos: tipo int, no qual 1- azul, 2- verde 3- castanho
         * ● cabelos: tipo int, no qual 1- louro, 2- preto, 3- castanho
         * No final, a saída deve informar a quantidade de cada ítem.
         */
        int totalMasculino = 0, totalFeminino = 0;
        int totalOlhoAzul = 0, totalOlhoVerde = 0, totalOlhoCastanho = 0;
        int totalCabeloLouro = 0, totalCabeloPreto = 0, totalCaveloCastanho = 0;

        char genero [] = new char[10];
        int corDosOlhos [] = new int[10];
        int corDosCabelos [] = new int[10];

        //Coletando dados do Usuario:
        for (int posicao = 0; posicao < 10; posicao++) {
            System.out.print("|------- Cadastro - Habitante "+posicao+" -------|\n");

            genero [posicao] = cadastroGenero();

            corDosOlhos [posicao] = cadastrarCorDosOlhos();

            corDosCabelos [posicao] = cadastrarCorDoCabelo();

            Clear ();
        }

        // Verifica o total de cada Gênero
        for (char posicao : genero) {
            if (posicao == 'M') {
                totalMasculino++;
            } else {
                totalFeminino++;
            }
        }

        // Verifica o total de cada cor de olho.
        for (int posicao : corDosOlhos) {
            if (posicao == 1) {
                totalOlhoAzul++;
            } else if (posicao == 2) {
                totalOlhoVerde++;
            } else {
                totalOlhoCastanho++;
            }
        }

        // Verifica o total de cada cor de cabelo.
        for (int posicao : corDosCabelos) {
            if (posicao == 1) {
                totalCabeloLouro++;
            } else if (posicao == 2) {
                totalCabeloPreto++;
            } else {
                totalCaveloCastanho++;
            }
        }

        //Printando os resultados
        System.out.println("============= GÊNERO =============");
        System.out.println("-> " + totalMasculino + " homens");
        System.out.println("-> " + totalFeminino + " mulheres");

        System.out.println("============= OLHOS =============");
        System.out.println("-> " + totalOlhoAzul + " azuis");
        System.out.println("-> " + totalOlhoVerde + " verdes");
        System.out.println("-> " + totalOlhoCastanho + " castanhos");

        System.out.println("============= CABELOS =============");
        System.out.println("-> " + totalCabeloLouro + " louros");
        System.out.println("-> " + totalCabeloPreto + " pretos");
        System.out.println("-> " + totalCaveloCastanho + " castanhos");
    }


    //Coletando Genero do Usuário
    public static char cadastroGenero () {
        Scanner scan = new Scanner(System.in);
        char genero;
        System.out.print("\n\n========================================\n" +
                "|               GÊNERO                 |\n" +
                "========================================\n" +
                "[M] Masculino\n" +
                "[F] Feminino\n" +
                "Digite a opção correspondente -> ");
        genero = scan.next().toUpperCase().charAt(0);
        while (genero != 'M' && genero != 'F' && genero != 'm' && genero != 'f') {
            System.out.print("\n\n========================================\n" +
                    "            Gênero inálido!\n" +
                    "        Digite um gênero válido:\n" +
                    "========================================\n\n");
            System.out.print("\n\n========================================\n" +
                    "|               GÊNERO                 |\n" +
                    "========================================\n" +
                    "[M] Masculino\n" +
                    "[F] Feminino\n" +
                    "Digite a opção correspondente -> ");
            genero = scan.next().toUpperCase().charAt(0);
        }
        return genero;
    }

    //Coletando Cor dos olhos do usuário
    public static int cadastrarCorDosOlhos () {
        Scanner scan = new Scanner(System.in);
        int olhos;
        System.out.print("\n\n========================================\n" +
                "|             Cor dos Olhos            |\n" +
                "========================================\n" +
                "[1] Azul\n" +
                "[2] Verde\n" +
                "[3] Castanho\n" +
                "Digite a opção correspondente -> ");
        olhos = scan.nextInt();

        while (olhos < 1 || olhos > 3) {
            System.out.print("\n\n========================================\n" +
                    "        Cor dos Olhos inválida!\n" +
                    "      Digite uma cor válida válido:\n" +
                    "========================================\n\n");
            System.out.print("\n\n========================================\n" +
                    "|            Cor dos Olhos             |\n" +
                    "========================================\n" +
                    "[1] Azul\n" +
                    "[2] Verde\n" +
                    "[3] Castanho\n" +
                    "Digite a opção correspondente -> ");
            olhos = scan.nextInt();
        }
        return olhos;
    }

    //Coletando cor do cabelo do usuário
    public static int cadastrarCorDoCabelo () {
        Scanner scan = new Scanner(System.in);
        int cabelo;
        System.out.print("\n\n========================================\n" +
                "|            Cor do Cabelo             |\n" +
                "========================================\n" +
                "[1] Louro\n" +
                "[2] Preto\n" +
                "[3] Castanho\n" +
                "Digite a opção correspondente -> ");
        cabelo = scan.nextInt();

        while (cabelo < 1 || cabelo > 3) {
            System.out.print("\n\n========================================\n" +
                    "        Cor do Cabelo inválida!\n" +
                    "      Digite uma cor válida válido:\n" +
                    "========================================\n\n");
            System.out.print("\n\n========================================\n" +
                    "|            Cor do Cabelo             |\n" +
                    "========================================\n" +
                    "[1] Louro\n" +
                    "[2] Preto\n" +
                    "[3] Castanho\n" +
                    "Digite a opção correspondente -> ");
            cabelo = scan.nextInt();
        }
        return cabelo;
    }

    //Limpar a tela
    public static void Clear() {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
}
