import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int frango;
        double al, id, total;

        frango = teclado.nextInt();
        al = (3.50 * 2);
        id = 4.00;

        total = ((frango * al) + (frango * id));

        System.out.println("o gasto total para marcar " + frango + " é R$" + total);

        teclado.close();


    }

}
