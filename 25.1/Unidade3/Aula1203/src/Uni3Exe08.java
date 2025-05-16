import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double dolar, cotação, reais;

        dolar = teclado.nextDouble();
        cotação = 5.65;
        reais = (dolar * cotação);

        System.out.println("o atendende deve devolver R$"+ df.format(reais) + " para o cliente.");

        teclado.close();

    }

}
