package exercicios.Linguagem1.POO.exercicio8;

public class Reserva {
    protected int totalDiarias;
    protected int codigo;
    protected Cliente cliente;
    protected Veiculo veiculo;

    public Reserva () {
        this.totalDiarias = 0;
        this.codigo = 0;
        this.cliente = null;
        this.veiculo = null;
    }

    public void escolherVeiculo (Veiculo veiculo) throws Exception {
        if (!veiculo.disponibilidade) {
            throw new Exception("Esse veículo não está disponível!");
        }
        this.veiculo = veiculo;
    }
}
