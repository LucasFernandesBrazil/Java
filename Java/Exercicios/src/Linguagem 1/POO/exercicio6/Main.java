package exercicios.Linguagem1.POO.exercicio6;

public class Main {
    public static void main(String[] args) {
        Hospede hospede = new Hospede();
        Hospedagem hospedagem = new Hospedagem();
        Quarto quarto = new Quarto();
        hospedagem.cadastroHospede();
        hospedagem.entrarHospedagem(hospede);
        hospedagem.calcularPreco(5);
    }
}
