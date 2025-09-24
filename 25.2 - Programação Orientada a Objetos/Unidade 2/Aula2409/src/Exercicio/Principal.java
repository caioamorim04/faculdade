package Exercicio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        new Principal().executar();
    }

    private void executar() {
        Scanner teclado = new Scanner(System.in);
        Turma turma = new Turma("programacao orientada a objetos");

        System.out.println("quantos alunos deseja cadastrar?");
        int qtd = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("digite o nome do aluno");
            String nome = teclado.nextLine();

            System.out.println("digite a nota do enem");
            double nota = teclado.nextDouble();
            teclado.nextLine();

            turma.incluirAluno(new Aluno(nome, nota));
        }

        System.out.println("alunos cadastrados:");
        for (Aluno a : turma.getAlunos()) {
            System.out.println(a.getNome() + " - nota enem: " + a.getNotaEnem());
        }

        Aluno melhor = turma.obterAlunoMelhorNotaEnem();
        if (melhor != null) {
            System.out.println("aluno com melhor nota enem: " + melhor.getNome() + " (" + melhor.getNotaEnem() + ")");

            teclado.close();
            
        }
    }
}
