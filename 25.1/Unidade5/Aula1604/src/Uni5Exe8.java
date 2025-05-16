import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int somaPositivos = 0;
        int contadorPositivos = 0;
        int menorNegativo = 0;

        System.out.print("Digite a quantidade de números: ");
        int qtdNumeros = teclado.nextInt();

        for (int i = 1; i <= qtdNumeros; i++) {
            System.out.print("Digite o " + i + " número: ");
            int numero = teclado.nextInt();

            if (numero < 0) {
                if (menorNegativo == 0 || numero < menorNegativo) {
                    menorNegativo = numero;
                }
            } else if (numero > 0) {
                somaPositivos += numero;
                contadorPositivos++;
            }
        }

        double media;
        if (contadorPositivos > 0) {
            media = somaPositivos / contadorPositivos;
        } else {
            media = 0;
        }

        if (menorNegativo != 0) {
            System.out.println("menor valor negativo: " + menorNegativo);
        } else {
            System.out.println("nenhum valor negativo foi informado.");
        }

        System.out.println("media de numeros positivos " + df.format(media));
        teclado.close();
    }
}
