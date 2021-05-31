package exercicios.Linguagem1.Exceptions.Exercicio8;

public class ImpossibleOperationException extends Exception{

    public ImpossibleOperationException() {
        super("Valor indisponível para sacar!");
    }
}
