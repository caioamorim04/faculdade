import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe02Uri {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

            double R; 
            double P;
            double A;

            P = 3.14159;
            R = teclado.nextDouble();

            A = P*(Math.pow(R, 2));

            System.out.println("A=" + df.format(A));

            teclado.close();
    }

}
