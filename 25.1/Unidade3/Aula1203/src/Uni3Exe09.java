import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double r, pi, alt, vol;

        r = teclado.nextDouble();
        alt = teclado.nextDouble();
        pi = 3.14159;

        vol = (pi * (r * r) * alt);

        System.out.println("o volume da lata de oleo é: " + df.format(vol));

        teclado.close();

    }
}
