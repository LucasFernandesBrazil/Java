package Java.Exercicios.src.Algoritmo;

public class Exercicio10 {
    public static void main(String[] args) {

        double salario = 1500;
        double C1 = 189;
        double C2 = 131;
        double restanteDoSalario;

        restanteDoSalario = salario - ((C1*0.2)+(C2*0.2)+C1+C2);

        System.out.print("Restará "+ restanteDoSalario + "R$ de seu salário, João");
    }
}
