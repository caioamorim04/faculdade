import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.println("entre com o comprimento do lado1");
        lado1 = teclado.nextDouble();
        System.out.println("entre com o comprimento do lado2");
        lado2 = teclado.nextDouble();
        System.out.println("entre com o comprimento do lado3");
        lado3 = teclado.nextDouble();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("é equilatero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("é isóceles");
            } else {
                System.out.println("é escaleno");
            }
        } else {
            System.out.println("não formam um triangulo");
        }

        teclado.close();

    }

}
