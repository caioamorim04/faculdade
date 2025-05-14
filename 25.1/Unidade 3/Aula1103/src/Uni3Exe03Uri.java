import java.util.Scanner;

public class Uni3Exe03Uri {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int A;
        int B;
        int PROD;

        A = teclado.nextInt();
        B = teclado.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

        teclado.close();

    }
}
