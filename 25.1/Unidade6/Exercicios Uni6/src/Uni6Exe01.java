import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        new Uni6Exe01();
    }

    private Uni6Exe01() {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        lerNumeros(numeros, teclado);
        escreverInverso(numeros);
        teclado.close();
    }

    private void lerNumeros(int[] vetor, Scanner teclado) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = teclado.nextInt();
        }
    }

    private void escreverInverso(int[] vetor) {
        System.out.println("Números na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
