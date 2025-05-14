import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe06Uri {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int N; // numero
        int H; // horas trabalhadas
        double V; // valor por hora
        double S; // salario

        N = teclado.nextInt();
        H = teclado.nextInt();
        V = teclado.nextDouble();

        S = (H * V);

        System.out.println("NUMBER = " + N);
        System.out.println("SALARY = U$ " + df.format(S));
        
        teclado.close();

    }

}
