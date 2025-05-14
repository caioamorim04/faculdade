
// Num sistema de equações o valor de A equivale ao valor de B e o valor de C equivale ao valor de D. Leia os valores de B, C e D e calcule o valor de A.

import java.util.Scanner;

public class Uni2Exe19 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite o valor de b");
        double b = teclado.nextDouble();

        System.out.println("digite o valor de c");
        double c = teclado.nextDouble();

        System.out.println("digite o valor de d");
        double d = teclado.nextDouble();

        double a = b;
        c = d;

        System.out.println("o valor de a é: " + a);
        System.out.println("o valor de c é: " + c);

        teclado.close();

    }

}
