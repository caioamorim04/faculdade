import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("x = ");
        int x = teclado.nextInt();
        System.out.println("y = ");
        int y = teclado.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("quadrante 0");
        } else if (x > 0 && y > 0) {
            System.out.println("quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("quadrante 4");
        }


        teclado.close();

    }

}
