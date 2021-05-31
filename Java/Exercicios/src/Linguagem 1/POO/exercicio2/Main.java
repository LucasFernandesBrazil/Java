package exercicios.Linguagem1.POO.exercicio2;

public class Main {
    public static void main(String[] args) {
        Invoice guitarra = new Invoice("332133", "Instrumento Musical", 2, 889);
        double invoiceAmount = guitarra.getInvoiceAmount();
        System.out.println("Número: " + guitarra.getNumero());
        System.out.println("Valor unitário: " + guitarra.getPreco());
        System.out.println("Quantidade: " + guitarra.getQuantidade());
        System.out.println("Descrição: " + guitarra.getDescricao());
        System.out.println("Valor da fatura: " + invoiceAmount);
    }
}
