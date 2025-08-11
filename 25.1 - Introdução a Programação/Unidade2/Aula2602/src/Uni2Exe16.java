
/*Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante
 compra uma determinada quantidade de cada formato, informe quantos litros de refrigerante ele comprou. */

import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a quantidade de latas: ");
        int qtdLata = teclado.nextInt();

        System.out.println("digite a quantidade de garrafas: ");
        int qtdGarrafa = teclado.nextInt();

        System.out.println("digite a quantidade de litros: ");
        int qtdLitro = teclado.nextInt();

        double lata = (0.35);
        double garrafa = (0.60);
        double litro = (2.0);

        double totalDeLitros = (qtdLata * lata) + (qtdGarrafa * garrafa) + (qtdLitro * litro);

        System.out.println("total: " + totalDeLitros + " litros");
        
        teclado.close();
    }

}
