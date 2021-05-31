package exercicios.Linguagem1.POO.exercicio8;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente () {
        this.nome = null;
        this.cpf = null;
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
}
