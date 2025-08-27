package questao02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionario();

            System.out.print("digite o nome do funcionario " + (i + 1) + ": ");
            funcionarios[i].setNome(teclado.nextLine());

            System.out.print("digite o salario do funcionario " + (i + 1) + ": ");
            funcionarios[i].setSalario(teclado.nextDouble());
            teclado.nextLine();
        }

        System.out.println("\nrelacao de funcionarios:");
        for (Funcionario f : funcionarios) {
            System.out.println("nome: " + f.getNome() +
                    " salario: " + df.format(f.getSalario()) +
                    " irpf: " + df.format(f.calcularIrpf()));
        }

        teclado.close();
    }
}
