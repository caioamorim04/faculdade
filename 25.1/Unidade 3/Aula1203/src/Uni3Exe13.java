import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double A, C, preço, azulejoM2, area, valorFinal;

        A = teclado.nextDouble();
        C = teclado.nextDouble();
        preço = 12.50;
        azulejoM2 = 9;
        area = C * A;
        valorFinal = ((area * azulejoM2) * preço);

        System.out.println("o valor final é R%" + valorFinal);

        teclado.close();

    }

}
