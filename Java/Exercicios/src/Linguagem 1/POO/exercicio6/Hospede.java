package exercicios.Linguagem1.POO.exercicio6;

public class Hospede {
    private String nome;
    private String cpf;
    private Genero genero;
    private String telefone;

    public Hospede() {
        this.nome = null;
        this.cpf = null;
        this.genero = null;
        this.telefone = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
