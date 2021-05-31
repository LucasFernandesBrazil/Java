package exercicios.Linguagem1.FuncoesProcedimentos;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x, y, z;
        System.out.print("Informe o primeiro valor de x: ");
        x = scan.nextFloat();
        System.out.print("Informe o primeiro valor de y: ");
        y = scan.nextFloat();
        System.out.print("Informe o primeiro valor de z: ");
        z = scan.nextFloat();
        System.out.println(verificadorDeTriangulo(x, y, z));

    }

    public static String verificadorDeTriangulo (float x, float y, float z) {
        String trianguloTipo = null;
        if (!(x < y + z && y < x + z && z < x + y)) {
            trianguloTipo = "\nAs medidas não correspondem a um triângulo";
        }
        else if (x == y && z == x ) {
            trianguloTipo = "\nTriângulo  Equilátero";
        }
        else if (x != y && y != z && z != x) {
            trianguloTipo = "\nTriângulo Escaleno";
        }
        else if (!((x == y && z == x) && (x != y && y != z && z != x))) {
            trianguloTipo = "\nTriângulo isósceles";
        }
        return trianguloTipo;
    }
}
