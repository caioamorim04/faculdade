import java.util.Scanner;

public class Uni6Exe5 {
    public static void main(String[] args) {
        new Uni6Exe5();
    }

    private Uni6Exe5() {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[20];

        lerNumeros(numeros, teclado);
        int iguais = contarIguaisAoPrimeiro(numeros);
        System.out.println("quantidade de numeros iguais ao primeiro: " + iguais);

        teclado.close();
    }

    private void lerNumeros(int[] numeros, Scanner teclado) {
        for (int i = 0; i < 20; i++) {
            System.out.print("digite o " + (i + 1) + " numero: ");
            numeros[i] = teclado.nextInt();
        }
    }

    private int contarIguaisAoPrimeiro(int[] numeros) {
        int primeiro = numeros[0];
        int contador = 0;
        for (int i = 1; i < 20; i++) {
            if (numeros[i] == primeiro) {
                contador++;
            }
        }
        return contador;
    }
}
