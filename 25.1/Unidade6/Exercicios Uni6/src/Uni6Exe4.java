import java.util.Scanner;

public class Uni6Exe4 {
    public static void main(String[] args) {
        new Uni6Exe4();
    }

    private Uni6Exe4() {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        lerNumeros(numeros, teclado);
        int x = lerNumeroX(teclado);
        mostrarIndices(numeros, x);

        teclado.close();
    }

    private void lerNumeros(int[] numeros, Scanner teclado) {
        for (int i = 0; i < 10; i++) {
            System.out.print("digite o " + (i + 1) + " numero: ");
            numeros[i] = teclado.nextInt();
        }
    }

    private int lerNumeroX(Scanner teclado) {
        System.out.print("digite o numero que deseja procurar: ");
        return teclado.nextInt();
    }

    private void mostrarIndices(int[] numeros, int x) {
        boolean achou = false;
        System.out.println("indices onde o numero aparece:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == x) {
                System.out.println(i);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("o numero nao aparece no vetor");
        }
    }
}
