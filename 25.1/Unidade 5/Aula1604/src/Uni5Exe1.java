import java.util.Scanner;

public class Uni5Exe1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            
            System.out.println("digite o numero");
            int numero = teclado.nextInt();

            if (numero % 2 == 0) {
                System.out.println("par");
            } else {
                System.out.println("impar");
            }
        }

        teclado.close();
    }

}
