package exercicios.Linguagem1.POO.exercicio10;

public class Cinema {
    private Filme filme;
    private SessaoFilme sessaoFilme;
    private Ingresso ingresso;
    private int [] poltrona;

    public Cinema() {
        this.filme = null;
        this.sessaoFilme = null;
        this.ingresso = null;
        this.poltrona = new int[100];
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

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public boolean verificarPoltrona (int numeroCadeira) {
        if (poltrona[numeroCadeira] == 0) {
            return true;
        }
        return false;
    }
    public void venderIngresso (Ingresso ingresso, int x) {
        if (verificarPoltrona(x)) {
            System.out.print("Valor total: R$" + ingresso.getPreco());
            poltrona[x] = 1;
        }
        else {
            System.out.println("Poltrona indisponível");
        }
    }
}
