import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dataPagamento, diaVencimento;
        double valorPrestação, valorFinal, valorDesconto, valorMulta, desconto, multa;
        
        diaVencimento = teclado.nextInt();
        dataPagamento = teclado.nextInt();
        valorPrestação = teclado.nextDouble();

        multa = (0.02 * (dataPagamento - diaVencimento));
        desconto = (valorPrestação - (valorPrestação * 0.10));
        valorDesconto = (valorPrestação - desconto);
        valorMulta = (valorPrestação * multa);

        if (diaVencimento > dataPagamento) {
            valorFinal = (valorPrestação - valorDesconto);
        } else {
            valorFinal = (valorPrestação + valorMulta);
        }

        System.out.println(valorFinal);

        teclado.close();

    }

}
