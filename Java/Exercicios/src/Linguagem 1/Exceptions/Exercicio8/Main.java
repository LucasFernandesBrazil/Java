package exercicios.Linguagem1.Exceptions.Exercicio8;

public class Main {
    public static void main(String[] args) throws ValueInvalidException, ImpossibleOperationException {
        ContaCorrente contaCorrente = new ContaCorrente();
        try {
            contaCorrente.setValorLimite(300);
            contaCorrente.setSaldo(400);
            contaCorrente.depositar(100);
            contaCorrente.sacar(200);
        }
        catch (ValueInvalidException valueInvalidException) {
            System.out.println(valueInvalidException.getMessage());
        }
        catch (ImpossibleOperationException impossibleOperationException) {
            System.out.println(impossibleOperationException.getMessage());
        }
        finally {
            System.out.println("Saldo: R$" +contaCorrente.getSaldo());
        }
    }
}

