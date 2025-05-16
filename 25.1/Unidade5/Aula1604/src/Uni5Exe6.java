import java.util.Scanner;

public class Uni5Exe6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double soma = 0;
        System.out.print("digite a quantidade de pessoas: ");
        int pessoas = teclado.nextInt();

        for (int i = 1; i <= pessoas; i++) {
            System.out.print("digite a altura da pessoa " + i + ": ");
            double altura = teclado.nextDouble();
            soma += altura;
        }

        double media = (soma / pessoas);

        System.out.println("a media das alturas é " + media);

        teclado.close();

    }

}
