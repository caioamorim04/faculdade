import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char caracter = teclado.next().charAt(0);

        caracter = Character.toUpperCase(caracter);

        if (caracter == 'M') {
            System.out.println("masculino");
        } else if (caracter == 'F') {
            System.out.println("feminino");
        }

        teclado.close();
    }

}
