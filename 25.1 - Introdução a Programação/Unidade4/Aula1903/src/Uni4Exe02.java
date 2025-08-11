import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("entre com um valor inteiro maior do que zero");
        int valor = teclado.nextInt();

        if (valor <= 0) {
            System.out.println("numero menor que zero");
        } else if (valor % 2 == 0) {
            System.out.println("numero é par");
        } else {
            System.out.println("numero é impar");
        }

        teclado.close();

    }

}
