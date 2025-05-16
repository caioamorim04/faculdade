import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("digite a quantidade de numeros: ");
        int n = teclado.nextInt();

        System.out.print("digite o pirmeiro numero: ");
        double numero = teclado.nextInt();
        double maior = numero;
        double menor = numero;

        for (int i = 2; i <= n; i++) {
            System.out.print("digite o " + i + " numero: ");
            numero = teclado.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("maior numero: " + df.format(maior));
        System.out.println("menor numero: " + df.format(menor));

        teclado.close();
    }

}
