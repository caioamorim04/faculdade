import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe07Uri {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        
        Scanner teclado = new Scanner(System.in);

        String N = teclado.next();
        double S = teclado.nextDouble();  
        double V = teclado.nextDouble();
        
        double C = V * 0.15;

        double SF = (S + C);

        System.out.println("FUNCIONARIO = " + N); // so para variavel nao ficar em amarelo
        System.out.println("TOTAL = R$ " + df.format(SF));

        teclado.close();

        
    }

}
