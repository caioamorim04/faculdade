
/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo
 que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.*/

import java.util.Scanner;

public class Uni2Exe7 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("nome do funcionário");
        String nome = teclado.next();

        System.out.println("digite o salario fixo");
        double salario = teclado.nextDouble();

        System.out.println("digite o valor em vendas");
        double vendas = teclado.nextDouble();

        double comissao = ((vendas * 15) / 100);
        System.out.println("funcionário: " + nome);
        System.out.printf("total é = R$ %.2f" , (comissao + salario));
        teclado.close();


    }

}
