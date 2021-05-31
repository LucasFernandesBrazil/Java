package exercicios.Linguagem1.Exceptions.Exercício5;

public class ExcecaoAcimaDeCem extends Exception{
    int soma;
    public ExcecaoAcimaDeCem(int numero, int soma) {
        super (   "\n    Limite de soma ATINGIDO!" +
                "\nNão é possível realizar esta soma.\n");
        this.soma = soma - numero;
    }
}
