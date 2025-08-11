
/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcular o salário
desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/

import java.util.Scanner;

public class Uni2Exe6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite numero de funcionarios");
        int funcionarios = teclado.nextInt();

        System.out.println("digite o numero de horas trabalhadas");
        int horas = teclado.nextInt();

        System.out.println("digite o valor por hora");
        double valorporhora = teclado.nextDouble();


        double salario = (horas * valorporhora);
        System.out.println("numero de funcionarios: "+(funcionarios));
        System.out.printf("salario = R$ %.2f" , salario);
        teclado.close();

    }

}
