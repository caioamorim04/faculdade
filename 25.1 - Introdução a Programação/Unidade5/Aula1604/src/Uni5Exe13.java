import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("numero de abastecimentos: ");
        int n = teclado.nextInt();

        double kmTotal = 0;
        double litrosTotal = 0;

        System.out.print("digite a km inicial: ");
        int kmAnterior = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("parada " + i + ": digite a quilometragem atual: ");
            int kmAtual = teclado.nextInt();
            System.out.print("parada " + i + ": digite a quantidade de combustivel: ");
            int lt = teclado.nextInt();

            double consumo = ((kmAtual - kmAnterior) / lt);
            System.out.println("parada " + i + ": " + consumo + "km/l");

            kmTotal = (kmTotal + (kmAtual - kmAnterior));
            litrosTotal = (litrosTotal + lt);

        }

        System.out.println("km media por litro: " + df.format(kmTotal / litrosTotal));

        teclado.close();

    }

}
