package exercicios.Linguagem1.POO.exercicio10;

public class Ingresso {
    private double preco;
    private Filme filme;
    private SessaoFilme sessaoFilme;

    public Ingresso() {
        this.preco = 0;
        this.filme = null;
        this.sessaoFilme = null;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public SessaoFilme getSessaoFilme() {
        return sessaoFilme;
    }

    public void setSessaoFilme(SessaoFilme sessaoFilme) {
        this.sessaoFilme = sessaoFilme;
    }
}
