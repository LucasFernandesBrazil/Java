package exercicios.Linguagem1.POO.exercicio9;

public class Livro {
    private String titulo;
    private String descricao;
    private Autor autor;
    private int quantidadePaginas;
    private Assunto assunto;
    private boolean lido;

    public Livro() {
        this.titulo = null;
        this.descricao = null;
        this.autor = null;
        this.lido = false;
        this.assunto = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public Assunto getAssunto() {
        return assunto;
    }

    public void setAssunto(Assunto assunto) {
        this.assunto = assunto;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }
}
