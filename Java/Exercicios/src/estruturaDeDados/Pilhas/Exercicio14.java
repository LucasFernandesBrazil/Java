package exercicios.pilhas;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        int cont = 0;
        StaticStackString estacionamento = new StaticStackString(10);
        System.out.println("\nBEM-VINDO(A) AO ESTACIONAMENTO ESUP\n\n");
        while (opcao != 4) {
            System.out.print("=-==-=-==-=-==-=-==-=-==" +
                               "\nEstacionar carro [1]" +
                               "\nTirar carro [2]" +
                               "\nConsultar vagas [3]" +
                               "\nSair do menu [4]" +
                               "\n=-==-=-==-=-==-=-==-=-==" +
                               "\n --> ");
            opcao = scan.nextInt();
            if (opcao == 1) {
                if (cont != 0) {
                if (!estacionamentoCheio(estacionamento)) {
                    estacionarCarro(estacionamento);
                    cont++;
                }
                else if (estacionamentoCheio(estacionamento)) {
                    System.out.println("Estacionamento cheio!");
                }
                }
                if (cont == 0) {
                    estacionarCarro(estacionamento);
                    cont++;
                }

            }
            if (opcao == 2) {
                if (estacionamento.isEmpty()) {
                    System.out.println("\nO estacionamento se encontra vazio! \n");
                }
                else {
                    retirarCarro(estacionamento);
                }
            }
            if (opcao == 3) {
                if (estacionamentoCheio(estacionamento)){
                    System.out.println("Estacionamento cheio!");
                }
                else {
                    System.out.println("Estacionamento possui vagas!");
                }
            }
            if (opcao == 4) {
                System.out.println("Software encerrado.");
            }
        }
    }

    public static void estacionarCarro (StaticStackString estacionamento) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe sua placa: ");
        String placa = scan.nextLine();
        estacionamento.push(placa);
        if (consultarCarro(estacionamento, placa)) {
            System.out.println("\nCarro estacionado! (" + placa + ")\n");
        }
        else {
            estacionamento.pop();
            System.out.println("Não foi possível estacionar este carro!" +
                               "\nMotivo: O carro já está no estacionamento");
        }
    }

    public static void retirarCarro (StaticStackString estacionamento) {
        StaticStackString aux = new StaticStackString(estacionamento.length());
        int contadorDeSaida = 0;
        int condicaoDeParada = 0;
        String placa, carroRetirado;
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe sua placa: ");
        placa = scan.nextLine();
        while (condicaoDeParada != 1) {
            carroRetirado = estacionamento.pop();
            if (carroRetirado.equals(placa)){
                System.out.println("\nCarro retirado com sucesso! ");
                System.out.println("Carros movidos: " + contadorDeSaida + "\n");
                condicaoDeParada = 1;
            }
            else {
                contadorDeSaida++;
                aux.push(carroRetirado);
            }
        }
        for (int i = 0; i < contadorDeSaida; i++) {
            estacionamento.push(aux.pop());
        }
    }

    public static boolean estacionamentoCheio (StaticStackString estacionamento) {
        if (estacionamento.isEmpty()) {
            return false;
        }
        StaticStackString aux = new StaticStackString(estacionamento.length());
        int contadorDeSaida = 0;
        int condicaoDeParada = 0;
        int temVaga = 0;
        String carroRetirado;
        while (condicaoDeParada != 1) {
            carroRetirado = estacionamento.pop();
            if (carroRetirado.equals("0")){
                condicaoDeParada = 1;
                temVaga = 1;
            }
            else {
                contadorDeSaida++;
                aux.push(carroRetirado);
            }
            if (estacionamento.isEmpty()) {
                condicaoDeParada = 1;
            }
        }
        for (int i = 0; i < contadorDeSaida; i++) {
            estacionamento.push(aux.pop());
        }
        if (temVaga == 1) {
            return false;
        }
        return true;
    }

    public static boolean consultarCarro (StaticStackString x, String placa) {
        StaticStackString pilhaAux = new StaticStackString( x.length());
        String vetorAux[] = new String[x.length()];
        for (int i = 0; i < x.length(); i++) {
            vetorAux[i] = x.pop();
            pilhaAux.push(vetorAux [i]);
        }
        for (int i = 0; i < x.length(); i++) {
            x.push(pilhaAux.pop());
        }
        for (int i = 0; i < x.length(); i++) {
            if (vetorAux[i] == placa) {
                return true;
            }
        }
        return false;
    }

}
