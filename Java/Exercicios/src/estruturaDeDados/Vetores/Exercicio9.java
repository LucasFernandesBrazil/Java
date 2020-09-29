package Java.Exercicios.src.estruturaDeDados.Vetores;
import java.util.Scanner;
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = scan.nextInt();
        int vetor[] = new int[tamanho];

        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Vetor[" + indice + "]= ");
            vetor[indice] = scan.nextInt();
        }
        int maiorElemento = maiorElemento(vetor);
        System.out.println("Maior: " + maiorElemento);

        int menorElemento = menorElemento(vetor);
        System.out.println("Menor: " + menorElemento);

        int valorMetade = elementoDaMetade(vetor);
            if (valorMetade == 0){
                System.out.println("O Array não possui um valor na sua metade, já que suas posições são pares. ");
            }
            else {
            System.out.println("Valor na metade: "+ valorMetade);
            }



    }

    //Buscando o maior elemento
    public static int maiorElemento(int vet[]) {
        int maior = 0;
        for (int indice = 0; indice < vet.length; indice++) {
            if (indice == 0)
                maior = vet[indice];

            if (vet[indice] > maior) {
                maior = vet[indice];
            }
        }
        return maior;
    }

    //Buscando o menor elemento
    public static int menorElemento(int vet[]) {
        int menor = 0;
        for (int indice = 0; indice < vet.length; indice++) {
            if (indice == 0)
                menor = vet[indice];

            if (vet[indice] < menor) {
                menor = vet[indice];
            }
        }
        return menor;
    }


    public static int elementoDaMetade (int vet[]){
        int metade;
        int valor = 0;
        if (vet.length % 2 == 0 ){
            valor = 0;
        }
        if (vet.length % 2 != 0){
            metade = vet[(vet.length/2) - 1];
            valor = vet[metade];
        }
        return valor;
    }
}
