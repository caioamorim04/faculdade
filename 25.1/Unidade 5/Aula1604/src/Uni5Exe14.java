import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int menor10 = 0;
        int entre10e20 = 0;
        int maior20 = 0;
        double compra = 0;
        double venda = 0;

        System.out.print("digite a qtd de produtos: ");
        int qtd = teclado.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.print("digite o nome do produto " + i + ": ");
            String nome = teclado.next();

            System.out.print("preço de compra: ");
            double pdc = teclado.nextDouble();

            System.out.print("preço de venda: ");
            double pdv = teclado.nextDouble();

            double percentual = ((pdv - pdc) / pdc * 100);  

            if (percentual < 10) {
                menor10 = (menor10 + 1); 
            } else if (percentual <= 20) {
                entre10e20 = (entre10e20 + 1);
            } else {
                maior20 = (maior20 + 1);
            }

            compra = (int) (compra + pdc);
            venda = (int) (venda + pdv);

            System.out.println(nome + ": compra " + compra + ", venda: " + venda);
        }


        double total = (venda - compra);

        System.out.println("produtos com lucro menor que 10: " + menor10);
        System.out.println("produtos com lucro entre 10 e 20: " + entre10e20);
        System.out.println("produtos com lucro maior que 20: " + maior20);
        System.out.println("total da compra " + df.format(compra));
        System.out.println("total da venda " + df.format(venda));
        System.out.println("total de lucro " + df.format(total));
        

        teclado.close();

    }

}
