package exercicios.Linguagem1.Exceptions.Exercício4;
class NumeroAbaixoDe10Exception extends Exception{

    public NumeroAbaixoDe10Exception(int numero) {
        super ("O número "+numero+" é inválido!");
    }
}