import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3exe09Uri {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        double A, B, C;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        double triangulo = (A * C / 2.0);
        double circulo = 3.14159 * (C * C);
        double trapezio = ((A + B) * C) / 2;
        double quadrado = B * B;
        double retangulo = A * B;
        
        System.out.println("TRIANGULO: " + df.format(triangulo));
        System.out.println("CIRCULO: " + df.format(circulo));
        System.out.println("TRAPEZIO: " + df.format(trapezio));
        System.out.println("QUADRADO: " + df.format(quadrado));
        System.out.println("RETANGULO: " + df.format(retangulo));

        teclado.close();

    }

}
