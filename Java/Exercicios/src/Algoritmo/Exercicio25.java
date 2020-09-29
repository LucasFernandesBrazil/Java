package Java.Exercicios.src.Algoritmo;

public class Exercicio25 {
    public static void main(String[] args) {

        int vetor [] = new int [99];
        int soma = 0;
        int media;

        for (int i = 12; i < vetor.length; i++) {
            soma = i + soma;
        }

        media = soma / 86;

        System.out.println("Média aritmédica: " + media);
        
    }
}
