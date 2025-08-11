import java.util.Scanner;

public class Uni6Exe7 {
    public static void main(String[] args) {
        new Uni6Exe7();
    }

    private Uni6Exe7() {
        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[10];

        lerNumeros(numeros, teclado);
        double menor = encontrarMenor(numeros);
        double maior = encontrarMaior(numeros);

        System.out.println("menor numero: " + menor);
        System.out.println("maior numero: " + maior);

        teclado.close();
    }

    private void lerNumeros(double[] numeros, Scanner teclado) {
        for (int i = 0; i < 10; i++) {
            System.out.print("digite o " + (i + 1) + " numero: ");
            numeros[i] = teclado.nextDouble();
        }
    }

    private double encontrarMenor(double[] numeros) {
        double menor = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    private double encontrarMaior(double[] numeros) {
        double maior = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
}
