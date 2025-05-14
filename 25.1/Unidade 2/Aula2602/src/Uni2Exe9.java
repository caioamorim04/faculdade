
/*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. Considerando
  que o atendente tem a cotação do dólar, calcule quantos reais o atendente deve devolver para a pessoa.*/

import java.util.Scanner;

public class Uni2Exe9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite quanto deseja converter");
        double valorDolar = teclado.nextDouble();
        double cotação = 5.8;
        double taxaDoCambio = 0.11;

        double valorReal = (valorDolar * (cotação + taxaDoCambio));

        System.out.printf("Valor a pagar: R$ %.2f%n" , valorReal);
        System.out.printf("Valor a receber: U$ %.2f%n" , valorDolar);

        teclado.close();

    }

}
