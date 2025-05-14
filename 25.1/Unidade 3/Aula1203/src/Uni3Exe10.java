import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double hip, catOp, catAdj;

        catOp = teclado.nextDouble();
        catAdj = teclado.nextDouble();
        hip = Math.sqrt(Math.pow(catOp, 2) + Math.pow(catAdj, 2));

        System.out.println("a hipotenusa é: " + df.format(hip));

        teclado.close();

    }

}
