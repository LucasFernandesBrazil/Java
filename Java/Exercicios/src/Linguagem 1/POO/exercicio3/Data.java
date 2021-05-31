package exercicios.Linguagem1.POO.exercicio3;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data (int dia, int mes, int ano) throws Exception{
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString () {
        String dataString;
        dataString = this.dia + "/" + this.mes + "/" + this.ano;
        return dataString;
    }

    public String avancarData () {
        String dataString = null;
        if (getMes() == 1 || getMes() == 3 || getMes() == 5 || getMes() == 7 || getMes() == 8 || getMes() == 10 || getMes() == 12) {
            if (getDia() == 31) {
                setDia(1);
                    if (getMes() == 12) {
                        setMes(1);
                        setAno(ano + 1);
                    }
                    else {
                        setMes(mes + 1);
                    }
                dataString = getDia() + "/" + getMes() + "/" + getAno();
            }
            else if (getDia() < 31) {
                setDia(dia + 1);
                dataString = getDia() + "/" + getMes() + "/" + getAno();
            }
        }
        else if (getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11) {
            if (getDia() == 30) {
                setDia(1);
                setMes(mes + 1);
                dataString = getDia() + "/" + getMes() + "/" + getAno();
            }
            else if (getDia() < 30) {
                setDia(dia + 1);
                dataString = getDia() + "/" + getMes() + "/" + getAno();
            }
        }
        else if (getMes() == 2) {
            if (getDia() == 29) {
                setDia(1);
                setMes(mes + 1);
            }
        }
        return dataString;
    }
}
