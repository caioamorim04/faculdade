import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double C, F;

        C = teclado.nextDouble();
        F = ((C * 1.8) + 32);

        System.out.println(df.format(F));

        teclado.close();
    }

}
