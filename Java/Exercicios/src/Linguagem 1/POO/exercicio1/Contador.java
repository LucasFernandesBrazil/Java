package exercicios.Linguagem1.POO.exercicio1;

public class Contador {
    private int numero;

    public Contador () {
        this.numero = 0;
    }

    public void zerar () {
        this.numero = 0;
    }

    public void incrementar () {
        this.numero++;
    }

    public int retornarValorContador () {
        return this.numero;
    }

    public int diminuirUmaPosicao () {return this.numero = numero -1;}
}
