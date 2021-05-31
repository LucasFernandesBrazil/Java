package exercicios.Linguagem1.Exceptions.Exercício6;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.deposita(100);
        minhaConta.setLimite(100);
        minhaConta.saque(101);
        System.out.println("Saque realizado com sucesso!");
    }
}