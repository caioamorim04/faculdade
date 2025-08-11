import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String nome = teclado.nextLine();
        double horasTrabalhadas = teclado.nextDouble();
        int dependentes = teclado.nextInt();

        double salarioTrabalho = horasTrabalhadas * 10;
        double salarioFamilia = dependentes * 60;
        double salarioBruto = salarioTrabalho + salarioFamilia;
        double descontoINSS = salarioTrabalho * 0.085;
        double descontoIR = salarioTrabalho * 0.05;
        double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

        System.out.println("o funcionario " + nome + " possui um salario bruto de R$" + df.format(salarioBruto) + " e um salario liquido de " + df.format(salarioLiquido));

        teclado.close();

    }
}
