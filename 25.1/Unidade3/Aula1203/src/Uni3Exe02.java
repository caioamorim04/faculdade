import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valor,  desconto, valorFinal;
        
        valor = teclado.nextDouble();
        desconto = (valor * 0.12);
        valorFinal = (valor - desconto);

        System.out.println("o valor do desconto é de R$" + df.format(desconto));
        System.out.println("o preço do par de sapatos com desconto é R$" + df.format(valorFinal));

        teclado.close();

    }
}
