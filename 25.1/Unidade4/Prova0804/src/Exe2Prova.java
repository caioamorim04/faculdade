import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe2Prova {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite o valor da compra:");
        double valorCompra = teclado.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Débito");
        System.out.println("2 - Pix");
        System.out.println("3 - Crediário");
        int formaPagamento = teclado.nextInt();

        switch (formaPagamento) {
            case 1:
                System.out.println("Forma de pagamento: Débito");
                System.out.println("Valor a pagar: R$" + valorCompra + ", sem desconto");
                break;

            case 2:
                double descontoPix = valorCompra * 0.03;
                double valorFinalPix = valorCompra - descontoPix;
                System.out.println("Forma de pagamento: Pix");
                System.out.println("Desconto: R$" + descontoPix);
                System.out.println("Valor a pagar: R$" + valorFinalPix);
                break;

            case 3:
                System.out.println("Informe o número de parcelas: ");
                int parcelas = teclado.nextInt();

                double valorParcela = valorCompra / parcelas;

                System.out.println("Forma de pagamento: Crediário");
                System.out.println("Total: R$" + valorCompra);
                System.out.println(parcelas + " parcelas de R$" + df.format(valorParcela) + " cada");

                System.out.println("Digite o número de dias após o vencimento que o pagamento está sendo realizado: ");
                int diasAtraso = teclado.nextInt();

                double valorPago = valorCompra;

                if (diasAtraso <= 0) {
                    double desconto = valorCompra * 0.10;
                    valorPago = valorCompra - desconto;
                    System.out.println("Pagamento em dia, desconto de 10% aplicado: R$" + desconto);
                    System.out.println("Valor final pago: R$" + valorPago);
                } else if (diasAtraso <= 5) {
                    System.out.println("Pagamento feito com " + diasAtraso + " dia(s) de atraso, sem desconto");
                    System.out.println("Valor pago: R$" + df.format(valorPago));
                } else {
                    double multa = valorCompra * 0.02 * diasAtraso;
                    valorPago = valorCompra + multa;
                    System.out.println("Pagamento com " + diasAtraso + " dias de atraso, multa de R$ " + multa);
                    System.out.println("Valor final pago: R$" + df.format(valorPago));
                }
                break;

            default:
                System.out.println("Forma de pagamento inválida");
                break;
        }

        teclado.close();
    }
}
