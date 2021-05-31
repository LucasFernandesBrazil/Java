package exercicios.Linguagem1.Exceptions.Exercício7;

public class Main {
    public static void main(String[] args) {
            Temperatura conversao = new Temperatura();
            conversao.coletaDeDados();
        try {
            conversao.conversorTemperatura();
        }
        catch (TemperatureException temperatureException) {
            System.out.println(temperatureException.getMessage());
        }
        finally {
            System.out.println("Temperatura convertida "+conversao.getCelsius() + "°C");
        }
    }
}
