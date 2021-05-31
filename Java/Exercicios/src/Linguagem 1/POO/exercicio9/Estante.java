package exercicios.Linguagem1.POO.exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Estante {
    private Livro livro;
    private List<Livro> estante;
    private int lidos;
    private int naoLidos;
    private int quantidadeLivros;

    public Estante() {
        this.livro = null;
        this.estante = new ArrayList<>();
        this.lidos = 0;
        this.naoLidos = 0;
        this.quantidadeLivros = 0;
    }

    public int getLidos() {
        return lidos;
    }

    public void setLidos(int lidos) {
        this.lidos = lidos;
    }

    public int getNaoLidos() {
        return naoLidos;
    }

    public void setNaoLidos(int naoLidos) {
        this.naoLidos = naoLidos;
    }

    public void adicionarLivro (Livro livro){
        estante.add(livro);
        quantidadeLivros = estante.size();
        this.naoLidos++;
    }

    public void pegaLivro (Livro livro) {
        this.naoLidos--;
        this.lidos++;
    }
}
