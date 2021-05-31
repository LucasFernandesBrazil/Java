package exercicios.Linguagem1.Exceptions.Exercicio8;

public class ContaCorrente {
    protected float limite;
    protected float saldo;
    protected float valorLimite;

    public ContaCorrente() {
        this.limite = 0f;
        this.saldo = 0f;
        this.valorLimite = 0f;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {

        this.limite = limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(float valorLimite) {
        this.valorLimite = valorLimite;
    }

    public void sacar (float valor) throws ValueInvalidException, ImpossibleOperationException {
        if (valor <= 0) {
            throw new ValueInvalidException();
        }
        if (valor > getSaldo() || valor + getLimite() > getValorLimite()) {
            throw new ImpossibleOperationException();
        }
        setSaldo(getSaldo()-valor);
        setLimite(getLimite()+valor);
    }

    public void depositar (float valor) throws ValueInvalidException {
        if (valor <= 0) {
            throw new ValueInvalidException();
        }
        setSaldo(getSaldo()+valor);
    }
}
