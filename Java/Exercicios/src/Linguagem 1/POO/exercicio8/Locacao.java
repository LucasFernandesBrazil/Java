package exercicios.Linguagem1.POO.exercicio8;

import java.util.Random;

public class Locacao {
    private Reserva reserva;
    private  double precoTotal;

    public Locacao() {
        this.reserva = null;
        this.precoTotal = 0;
    }

    public Reserva getReserva() {
        return reserva;
    }
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public void finzalizarLocacao () {
        Random random = new Random();
        Reserva reserva = new Reserva();
        precoTotal = reserva.totalDiarias * reserva.veiculo.getDiaria();
    }

    public void calcularPrecoTotal () {
        System.out.println("Preço total: " + getPrecoTotal());
    }
}
