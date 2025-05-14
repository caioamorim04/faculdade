
/* Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número
  de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.*/

import java.util.Scanner;

public class Uni2Exe8 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a peça 1");
        String peça1 = teclado.next();

        System.out.println("Digite a quantidade da peça 1");
        int qtd1 = teclado.nextInt();

        System.out.println("Digite o valor da peça 1");
        double valor1 = teclado.nextDouble();

        System.out.println("Digite a peça 2");
        String peça2 = teclado.next();

        System.out.println("Digite a quantidade da peça 2");
        int qtd2 = teclado.nextInt();

        System.out.println("Digite o valor da peça 2");
        double valor2 = teclado.nextDouble();
        
        double valorFinal1;
        double valorFinal2;
        double valorTotal;

        valorFinal1 = (qtd1 * valor1);
        valorFinal2 = (qtd2 * valor2);
        
        valorTotal = (valorFinal1 + valorFinal2);

        System.out.println("Peça 1: " + peça1);
        System.out.println("Valor: " + valorFinal1);

        System.out.println("Peça 2: " + peça2);
        System.out.println("Valor: " + valorFinal2);

        System.out.printf("valor final: R$ %.2f" , valorTotal);

        teclado.close();
        
        

    }

}
