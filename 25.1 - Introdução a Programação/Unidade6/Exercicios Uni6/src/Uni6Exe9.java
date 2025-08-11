import java.util.Scanner;

public class Uni6Exe9 {
    public static void main(String[] args) {
        new Uni6Exe9();
    }

    private Uni6Exe9() {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        lerNumeros(numeros, teclado);
        int ultimo = numeros[9];
        mostrarIguaisAoUltimo(numeros, ultimo);

        teclado.close();
    }

    private void lerNumeros(int[] numeros, Scanner teclado) {
        for (int i = 0; i < 10; i++) {
            System.out.print("digite o " + (i + 1) + " numero: ");
            numeros[i] = teclado.nextInt();
        }
    }

    private void mostrarIguaisAoUltimo(int[] numeros, int ultimo) {
        System.out.println("valores iguais ao ultimo numero digitado:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == ultimo) {
                System.out.println(numeros[i]);
            }
        }
    }
}
