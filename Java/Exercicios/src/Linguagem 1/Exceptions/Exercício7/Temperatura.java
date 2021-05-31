package exercicios.Linguagem1.Exceptions.Exercício7;

import java.util.Scanner;

public class Temperatura {
    public double celsius, fahrenheit;
    public double conversao = 0;

    public Temperatura() {
        this.celsius = 0;
        this.fahrenheit = 0;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getConversao() {
        return conversao;
    }

    public void setConversao(double conversao) {
        this.conversao = conversao;
    }

    public void conversorTemperatura() throws TemperatureException {
        setCelsius((5 * (getFahrenheit() - 32)) / 9);
        double zeroAbsoluto = -459.67;
        if (getFahrenheit() <= zeroAbsoluto) {
            throw new TemperatureException();
        }
    }

    public void coletaDeDados () {
        Scanner scan = new Scanner(System.in);
        System.out.println("=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==" +
                           "\n  Bem vindo(a) ao conversor de temperatura!" +
                           "\n=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==\n\n");
        System.out.print("Informe a temperatura em Fahrenheit: ");
        setFahrenheit(scan.nextDouble());
    }
}

