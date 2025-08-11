
/*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. A
 empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são
 feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Ao final informe o 
 nome, o salário bruto e o salário líquido do funcionário. */

import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);

        System.out.println("nome do funcionario");
        String nome = teclado.next();

        System.err.println("digite as horas trabalhadas");
        double horasTrabalhas = teclado.nextDouble();

        System.out.println("digite os dependentes");
        int dependentes = teclado.nextInt();

        int valorHora = 10;
        int valorDependente = 60;
        double INSS = 0.085;
        double IRR = 0.05;

        double salarioBruto = ((horasTrabalhas * valorHora) + (dependentes * valorDependente));
        double descontoINSS = (salarioBruto * INSS);
        double descontoIRR = (salarioBruto * IRR);
        double salarioLiquido = (salarioBruto - (descontoINSS + descontoIRR));

        System.out.println("nome: " + nome);
        System.out.println("salario bruto: " + salarioBruto);
        System.err.println("salario liquido" + salarioLiquido);

        teclado.close();

    }

}
