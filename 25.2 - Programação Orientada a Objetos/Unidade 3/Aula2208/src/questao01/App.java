package questao01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        Funcionario f = new Funcionario();

        System.out.print("digite o nome do funcionario: ");
        f.setNome(teclado.nextLine());

        System.out.print("digite o salario: ");
        f.setSalario(teclado.nextDouble());

        double imposto = f.calcularIrpf();

        System.out.println("funcionario: " + f.getNome());
        System.out.println("salario: " + df.format(f.getSalario()));
        System.out.println("imposto de renda: " + df.format(imposto));

        teclado.close();
    }
}
