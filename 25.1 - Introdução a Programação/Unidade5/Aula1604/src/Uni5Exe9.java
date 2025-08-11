import java.util.Scanner;

public class Uni5Exe9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome18 = "";
        int nomeAcima20= 0;

        System.out.print("digite a quantidade de alunos: ");;
        int qtdAlunos = teclado.nextInt();

        for (int i = 1; i <= qtdAlunos; i++) {
            System.out.print("nome do " + i + " aluno: ");
            String nome = teclado.next();
            System.out.print("idade de " + nome + ": ");
            int idade = teclado.nextInt();
            
            if (idade == 18) {
                nome18 = nome;
            } else {
                nome18 = nome18 + ", " + nome;
            }

            if (idade < 20) {
                nomeAcima20 = nomeAcima20 + 1;
            }
        }

        System.out.println("nomes alunos que tem 18 anos: " + nome18);
        System.out.println("quantidade de alunos acima de 20 anos " + nomeAcima20);

        teclado.close();

    }

}
