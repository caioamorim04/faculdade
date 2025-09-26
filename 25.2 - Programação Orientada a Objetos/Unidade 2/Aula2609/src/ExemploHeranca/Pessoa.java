package ExemploHeranca;

public class Pessoa {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("cpf invalido");
        }
        this.cpf = cpf;
    }
}
