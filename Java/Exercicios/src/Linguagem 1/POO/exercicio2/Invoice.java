package exercicios.Linguagem1.POO.exercicio2;

public class Invoice {

    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Invoice (String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        if (quantidade < 0) {
            this.quantidade = 0;
        }
        this.quantidade = quantidade;
        if (preco < 0.0) {
            this.preco = 0.0;
        }
        this.preco = preco;
    }

    public double getInvoiceAmount () {
        double fatura = this.quantidade * this.preco;
        return fatura;
    }

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
