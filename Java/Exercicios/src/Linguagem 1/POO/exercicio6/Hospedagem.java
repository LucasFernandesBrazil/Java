package exercicios.Linguagem1.POO.exercicio6;

import java.util.Random;
import java.util.Scanner;

public class Hospedagem {
    private int numeroQuarto;
    private TipoQuarto tipoQuarto;
    private double precoDiaria;

    public Hospedagem() {
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
        this.precoDiaria = precoDiaria;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public void cadastroHospede () {
        Scanner scan = new Scanner(System.in);
        Hospede hospede = new Hospede();
        System.out.print("Informe seu nome: ");
        hospede.setNome(scan.nextLine());
        System.out.print("Informe seu cpf: ");
        hospede.setCpf(scan.nextLine());
        System.out.print("Informe seu telefone: ");
        hospede.setTelefone(scan.nextLine());
        System.out.print("Informe seu sexo: (MASCULINO ou FEMININO): ");
        if (scan.nextLine().equals("MASCULINO")) {
            hospede.setGenero(Genero.MASCULINO);
        }
        else if (scan.nextLine().equals("FEMININO")) {
            hospede.setGenero(Genero.FEMINO);
        }
    }

    public void entrarHospedagem (Hospede hospede) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        hospede.getCpf();
        Hospedagem hospedagem = new Hospedagem();
        hospedagem.setNumeroQuarto(random.nextInt((9999 - 1000) + 1) + 1000);
        System.out.print("Tipo do quarto: " +
                           "\nLUXO, EXECUTIVO, PADRÃO OU PRESIDENCIAL: ");
        if (scan.nextLine().equals("LUXO")) {
            hospedagem.setTipoQuarto(TipoQuarto.LUXO);
        }
        else if (scan.nextLine().equals("EXECUTIVO")) {
            hospedagem.setTipoQuarto(TipoQuarto.EXECUTIVO);
        }
        else if (scan.nextLine().equals("PADRÃO")) {
            hospedagem.setTipoQuarto(TipoQuarto.PADRAO);
        }
        else if (scan.nextLine().equals("PRESIDENCIAL")) {
            hospedagem.setTipoQuarto(TipoQuarto.PRESIDENCIAL);
        }
    }

    public void calcularPreco (int dias) {
        double valor = getPrecoDiaria()*dias;
        System.out.print("Valor total: " + valor);
    }
}
