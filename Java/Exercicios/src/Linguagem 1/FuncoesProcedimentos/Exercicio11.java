package exercicios.Linguagem1.FuncoesProcedimentos;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        System.out.println("Número Romano correspondente -> " + conversorNumeroRomano(numero));
    }

    public static String conversorNumeroRomano (int x) {
        String numeroRomano = null;
        int unidade, dezena;
        if (x < 1) {
            numeroRomano = "ERROR! NÚMERO INEXISTENTE";
        }
        if (x > 0 && x < 10) {
            numeroRomano = numerosRomanosUnidade(x);
        }
        if (x >= 10 && x <= 50) {
            unidade = x % 10;
            dezena = x - unidade;
            numeroRomano = numerosRomanosDecimal(dezena) + numerosRomanosUnidade(unidade);
        }
        if (x > 50) {
            numeroRomano = "ERROR!";
        }

        return numeroRomano;
    }

    public static String numerosRomanosUnidade (int x) {
        String numeroRomano = "";
        if (x == 1) {
            numeroRomano = "I";
        }
        if (x == 2) {
            numeroRomano = "II";
        }
        if (x == 3) {
            numeroRomano = "III";
        }
        if (x == 4) {
            numeroRomano = "IV";
        }
        if (x == 5) {
            numeroRomano = "V";
        }
        if (x == 6) {
            numeroRomano = "VI";
        }
        if (x == 7) {
            numeroRomano = "VII";
        }
        if (x == 8) {
            numeroRomano = "VIII";
        }
        if (x == 9) {
            numeroRomano = "IX";
        }
        return numeroRomano;
    }

    public static String numerosRomanosDecimal (int x) {
        String numeroRomano = "";
        if (x > 9 && x < 20) {
            numeroRomano = "X";
        }
        if (x > 19 && x < 30) {
            numeroRomano = "XX";
        }
        if (x > 29 && x < 40) {
            numeroRomano = "XXX";
        }
        if (x > 39 && x < 50) {
            numeroRomano = "XL";
        }
        if (x > 49 && x < 60) {
            numeroRomano = "L";
        }
        if (x > 59 && x < 70) {
            numeroRomano = "LX";
        }
        if (x > 69 && x < 80) {
            numeroRomano = "LXX";
        }
        if (x > 79 && x < 90) {
            numeroRomano = "LXXX";
        }
        if (x > 89 && x < 100) {
            numeroRomano = "XC";
        }
        return numeroRomano;
    }
}
