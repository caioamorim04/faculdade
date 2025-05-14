import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double kg, pto, vlr, vlrTotal;

        kg = teclado.nextDouble();
        pto = 0.75;
        vlr = 25;
        vlrTotal = ((kg - pto) * vlr);

        System.out.println("o valor do prato do cliente é R$" + vlrTotal);

        teclado.close();

    }

}
