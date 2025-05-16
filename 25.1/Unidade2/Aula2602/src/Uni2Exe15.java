
/* Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de 
notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 
1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias. */

import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite o valor:");
        double dinheiro = teclado.nextDouble();
        int notas = (int) dinheiro;
        int moedas = (int) ((dinheiro - notas) * 100);

        int notas100 = notas / 100;
        notas -= notas100 * 100;
        int notas50 = notas / 50;
        notas -= notas50 * 50;
        int notas20 = notas / 20;
        notas -= notas20 * 20;
        int notas10 = notas / 10;
        notas -= notas10 * 10;
        int notas5 = notas / 5;
        notas -= notas5 * 5;
        int notas2 = notas / 2;
        notas -= notas2 * 2;
        int moedas1 = notas;
        notas -= moedas1 * 1;
        int moedas50 = moedas / 50;
        moedas -= moedas50 * 50;
        int moedas25 = moedas / 25;
        moedas -= moedas25 * 25;
        int moedas10 = moedas / 10;
        moedas -= moedas10 * 10;
        int moedas05 = moedas / 5;
        moedas -= moedas05 * 5;
        int moedas01 = moedas;
        
        System.out.println("NOTAS:");
        System.out.println(notas100 + " notas de R$ 100.00");
        System.out.println(notas50 + " notas de R$ 50.00");
        System.out.println(notas20 + " notas de R$ 20.00");
        System.out.println(notas10 + " notas de R$ 10.00");
        System.out.println(notas5 + " notas de R$ 5.00");
        System.out.println(notas2 + " notas de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moedas de R$ 1.00");
        System.out.println(moedas50 + " moedas de R$ 0.50");
        System.out.println(moedas25 + " moedas de R$ 0.25");
        System.out.println(moedas10 + " moedas de R$ 0.10");
        System.out.println(moedas05 + " moedas de R$ 0.05");
        System.out.println(moedas01 + " moedas de R$ 0.01");

        teclado.close();
    }


}
