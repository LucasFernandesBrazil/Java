package exercicios.Linguagem1.POO.exercicio10;

public class Filme {
    private String nome;
    private  String descricao;
    private Categoria categoria;

    public Filme() {
        this.nome = null;
        this.descricao = null;
        this.categoria = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
