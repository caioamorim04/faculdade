import java.util.Scanner;

public class Uni6Exe2 {
    public static void main(String[] args) {
        new Uni6Exe2();
    }

    private Uni6Exe2() {
        Scanner teclado = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] soma = new int[5];

        lerVetor(vetor1, teclado, "primeiro");
        lerVetor(vetor2, teclado, "segundo");
        somarVetor(vetor1, vetor2, soma);
        exibirSoma(soma);

        teclado.close();

    }

    private void exibirSoma(int[] soma) {
        System.out.println("soma: ");
        for (int i = 0; i < soma.length; i++) {
            System.out.println("posição " + i + ": " + soma[i]);
        }

    }

    private void somarVetor(int[] vetor1, int[] vetor2, int[] soma) {
        for (int i = 0; i < soma.length; i++) {
            soma[i] = (vetor1[i] + vetor2[i]);
        }
    }

    private void lerVetor(int[] vetor, Scanner teclado, String string) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("digite o " + (i + 1) + " numero do " + string + " vetor: ");
            vetor[i] = teclado.nextInt();
        }
    }



}
