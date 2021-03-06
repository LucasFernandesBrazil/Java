package exercicios.Linguagem1.POO.exercicio8;

public class Veiculo {
    protected String placa;
    protected String cor;
    protected String modelo;
    protected TipoCarro tipoCarro;
    protected String fabricante;
    protected int ano;
    protected double diaria;
    protected boolean disponibilidade;

    public Veiculo () {
        this.cor = "";
        this.modelo = "";
        this.tipoCarro = null;
        this.fabricante = "";
        this.ano = 0;
        this.diaria = 0;
        this.disponibilidade = true;
        this.placa = "";
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public boolean setDisponibilidade() {
        return this.disponibilidade = disponibilidade;
    }
}
