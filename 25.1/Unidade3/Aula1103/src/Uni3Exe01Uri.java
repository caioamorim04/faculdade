import java.util.Scanner;

public class Uni3Exe01Uri {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int A;
        int B;
        int X;

        A = teclado.nextInt();
        B = teclado.nextInt();

        X = A + B;

        System.out.println("X = " + X);

        teclado.close();

    }

}
