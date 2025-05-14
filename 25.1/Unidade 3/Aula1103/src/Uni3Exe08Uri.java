import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe08Uri {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int Q1, P1;
        int Q2, P2;

        double V1, V2;

        double VF;

        P1 = teclado.nextInt();
        Q1 = teclado.nextInt();
        V1 = teclado.nextDouble();
        P2 = teclado.nextInt();
        Q2 = teclado.nextInt();
        V2 = teclado.nextDouble();

        VF = Q1 * V1 + Q2 * V2;

        System.out.println(P1 + P2);// so para variavel nao ficar em amarelo
        System.out.println("VALOR A PAGAR: R$ " + df.format(VF));

        teclado.close();
        
    }

}
