import java.util.Scanner;

public class Uni6Exe3 {
    public static void main(String[] args) {
        new Uni6Exe3();
    }

    private Uni6Exe3() {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[20];

        lerNumeros(numeros, teclado);
        double media = calcularMedia(numeros);
        exibirMaioresQueMedia(numeros, media);

        teclado.close();
    }

    private void lerNumeros(double[] numeros, Scanner teclado) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = teclado.nextDouble();
        }
    }

    private double calcularMedia(double[] numeros) {
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma / numeros.length;
    }

    private void exibirMaioresQueMedia(double[] numeros, double media) {
        System.out.println("Média: " + media);
        System.out.println("Números maiores que a média:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }
    }
}
