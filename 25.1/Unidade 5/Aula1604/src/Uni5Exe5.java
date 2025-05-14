import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000000");

        System.out.print("digite o valor: ");
        int n = teclado.nextInt();

        if (n <= 2) {
            System.out.println("valor invalido");
        } else {
            for (int i = 1; i <= n; i++) {
                double value = 1.0 / i;
                System.out.println("dividido por " + i + ": " + df.format(value));
            }
        }
        
        teclado.close();
        
    }

}
