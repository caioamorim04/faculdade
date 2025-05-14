import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double rendaAnual, rendaLiquida, imposto, desconto;
        int dependentes;

        rendaAnual = teclado.nextInt();
        dependentes = teclado.nextInt();
        rendaLiquida = (rendaAnual * (1 - (dependentes * 0.02)));

        if (rendaLiquida <= 2000) {
            imposto = 0;
            desconto = 0;
        } else if (rendaLiquida <= 5000) {
            imposto = rendaLiquida * 0.05;
            desconto = 5;
        } else if (rendaLiquida <= 10000) {
            imposto = rendaLiquida * 0.10;
            desconto = 10;
        } else {
            imposto = rendaLiquida * 0.15;
            desconto = 15;
        }
        
        System.out.println("O imposto é de " + desconto + "%: " + df.format(imposto));

        teclado.close();

    }

}
