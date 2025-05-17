import java.util.Scanner;

public class Uni6Exe8 {
    public static void main(String[] args) {
        new Uni6Exe8();
    }

    private Uni6Exe8() {
        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[6];

        lerNumeros(numeros, teclado);
        double media = calcularMedia(numeros);
        mostrarMaioresQueMedia(numeros, media);

        teclado.close();
    }

    private void lerNumeros(double[] numeros, Scanner teclado) {
        for (int i = 0; i < 6; i++) {
            System.out.print("digite o " + (i + 1) + " numero: ");
            numeros[i] = teclado.nextDouble();
        }
    }

    private double calcularMedia(double[] numeros) {
        double soma = 0;
        for (int i = 0; i < 6; i++) {
            soma = soma + numeros[i];
        }
        return soma / 6;
    }

    private void mostrarMaioresQueMedia(double[] numeros, double media) {
        System.out.println("numeros maiores que a media:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }
    }
}
