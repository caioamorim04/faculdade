import java.util.Scanner;

public class Uni6Exe6 {
    public static void main(String[] args) {
        new Uni6Exe6();
    }

    private Uni6Exe6() {
        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[10];

        lerNumeros(numeros, teclado);
        double media = calcularMedia(numeros);
        int maiores = contarMaioresQueMedia(numeros, media);

        System.out.println("media: " + media);
        System.out.println("quantidade de numeros maiores que a media: " + maiores);

        teclado.close();
    }

    private void lerNumeros(double[] numeros, Scanner teclado) {
        for (int i = 0; i < 10; i++) {
            System.out.print("digite o " + (i + 1) + " numero: ");
            numeros[i] = teclado.nextDouble();
        }
    }

    private double calcularMedia(double[] numeros) {
        double soma = 0;
        for (int i = 0; i < 10; i++) {
            soma = soma + numeros[i];
        }
        return soma / 10;
    }

    private int contarMaioresQueMedia(double[] numeros, double media) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > media) {
                contador++;
            }
        }
        return contador;
    }
}
