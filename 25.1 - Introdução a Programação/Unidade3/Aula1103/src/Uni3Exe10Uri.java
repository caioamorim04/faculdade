import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe10Uri {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        double X1, X2, Y1, Y2;

        X1 = teclado.nextDouble();
        Y1 = teclado.nextDouble();
        X2 = teclado.nextDouble();
        Y2 = teclado.nextDouble();

        double D = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));

        System.out.println(df.format(D));

        teclado.close();

    }

}
