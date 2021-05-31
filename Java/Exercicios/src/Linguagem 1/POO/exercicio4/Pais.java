package exercicios.Linguagem1.POO.exercicio4;

public class Pais {
    private String codigoISO;
    private String nome;
    private int populacao;
    private double dimensao;

    public Pais (String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.dimensao = dimensao;
        this.nome = nome;
        this.populacao = 0;
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean verificadorPais (Pais x, Pais y) {
        return x.getCodigoISO().equals(y.getCodigoISO());
    }

    public static void verificadorLimitrofe () {

    }

    public double densidadePopulacional() {
        return this.dimensao / this.populacao;
    }

    public void vizinhosComuns (Pais x) {

    }
}
