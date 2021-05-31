package exercicios.Linguagem1.Algoritmo;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A, B, C;

        System.out.println("---------- Equação do segundo Grau ----------");
        System.out.print("Digite o valor de A: ");
        A = scan.nextInt();
        System.out.print("Digite o valor de B: ");
        B = scan.nextInt();
        System.out.print("Digite o valor de C: ");
        C = scan.nextInt();

        double delta = B*B - 4*A*C;

            if (delta < 0) {
                System.out.println("Não possue raízes reais!");
            }

                if (delta > 0) {
                    double equacao1 = (-B - Math.sqrt(delta)) / 2*A ;
                    double equacao2 = (- B + Math.sqrt(delta)) / 2*A ;
                    System.out.println("Possui duas raízes reais!");
                    System.out.println("Raíz [1]: "+ equacao1);
                    System.out.println("Raíz [2]: "+ equacao2);
                }

                    if (delta == 0){
                        double equacao1 = -B / 2.0*A ;
                        System.out.println("Possui uma raiz real!");
                        System.out.println("Raíz: "+ equacao1);
                    }

    }
}
