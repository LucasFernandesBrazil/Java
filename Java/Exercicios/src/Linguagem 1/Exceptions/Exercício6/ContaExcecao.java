package exercicios.Linguagem1.Exceptions.Exercício6;

public class ContaExcecao extends Exception{

    public ContaExcecao () {
        super("\n***************************************" +
              "\nValor do saque é maior que seu Saldo" +
              "\n          Tente novamente!" +
              "\n***************************************\n");
    }
}
