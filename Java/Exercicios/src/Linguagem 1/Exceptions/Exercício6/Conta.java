package exercicios.Linguagem1.Exceptions.Exercício6;


public class Conta {
    private double saldo;
    private double limite;

    public Conta() {
        this.saldo = 0;
        this.limite = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double saqueDiario) {
        this.limite = saqueDiario;
    }

    public void deposita (double number) {
        setSaldo(getSaldo() + number);
    }

    public void saque (double number) {
        try {

            if (getLimite() < number) {
                throw new ContaExcecao();
            }
            setSaldo(getSaldo() - number);
        }
        catch (ContaExcecao contaExcecao) {
            System.out.println(contaExcecao.getMessage());
            System.exit(0);
        }
    }
}
