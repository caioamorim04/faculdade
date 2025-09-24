package Exercicio;

public class Aluno {
    private String nome;
    private double notaEnem;

    public Aluno(String nome, double notaEnem) {
        this.nome = nome;
        this.notaEnem = notaEnem;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }
}
