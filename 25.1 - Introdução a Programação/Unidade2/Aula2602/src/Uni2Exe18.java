
/* Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Leia o comprimento e altura de uma parede (em metros) e
 escreva o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos. */

import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double preço = 12.50;
        int azulejosM2 = 9;

        System.out.println("digite o comprimento: ");
        double comprimento = teclado.nextDouble();

        System.out.println("digite a altura");
        double altura = teclado.nextDouble();

        double area = (comprimento * altura);
        
        int azulejosTotal = (int) Math.ceil(area * azulejosM2);

        double valor = (azulejosTotal * preço);

        System.out.printf("valor total %.2f" , valor);

        teclado.close();


    }

}
