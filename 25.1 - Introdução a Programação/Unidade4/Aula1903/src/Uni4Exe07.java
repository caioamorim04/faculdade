import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        int peso;
        float valorPagar, pesoExcedido, qtdAdicional;

        peso = teclado.nextInt();

        if (peso > 50) {
            pesoExcedido = (peso - 50);
            qtdAdicional = ((pesoExcedido / 20) + 1);
            valorPagar = (0.45f + (0.45f * qtdAdicional));
        } else {
            valorPagar = 0.45f;
        }

        System.out.println("Custo do selo " + df.format(valorPagar));

        teclado.close();
    
    }

}
