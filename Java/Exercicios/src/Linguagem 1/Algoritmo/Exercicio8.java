package exercicios.Linguagem1.Algoritmo;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        double Vm, tempoDeViagem, distanciaPercorrida, litros;

        System.out.print("Informe o tempo gasto na viagem (minutos): ");
        tempoDeViagem = scan.nextDouble();
        tempoDeViagem = tempoDeViagem/60;

        System.out.print ("Informe a velocidade média da viagem: ");
        Vm = scan.nextDouble();

        distanciaPercorrida = tempoDeViagem* Vm;

        litros = distanciaPercorrida / 12;

        LimparTela();
        System.out.println ("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==\n" +
                "        D A D O S  DA  V I A G E M \n" +
                "=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==\n\n" +
                "Velocidade Média: " + Vm + "Km/h\n" +
                "Tempo gasto na viagem: " + Math.round (tempoDeViagem) + " Horas \n" +
                "Distância percorrida: " + Math.round (distanciaPercorrida) + "Km\n" +
                "Quantidade de Litros gastos: " + Math.round (litros) + " litros");
    }

    //Método para limpar a tela
    public static void LimparTela () {
        System.out.print ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}

