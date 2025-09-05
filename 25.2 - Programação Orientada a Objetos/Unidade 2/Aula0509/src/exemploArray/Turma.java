package exemploArray;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private ArrayList<Aluno> alunos;

    public Turma(String nome) {
        setNome(nome);
        alunos = new ArrayList();
    }

    public void adicionar(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno Invalido");
        }

        alunos.add(aluno);
    }

    public ArrayList<Aluno> listar() {
        return alunos;
    }

    public Aluno buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }

        return null;
    }

    public void remover(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno Invalido");
        }

        alunos.remove(aluno); 

    }

    public void atualizar(Aluno alunoNovo) {
        Aluno antigo = buscarAluno(alunoNovo.getNome());
        if (antigo == null) {
        throw new IllegalArgumentException("aluno nao existe");
        }
        antigo.setMatricula(alunoNovo.getMatricula());
        antigo.setTurno(alunoNovo.getTurno());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
