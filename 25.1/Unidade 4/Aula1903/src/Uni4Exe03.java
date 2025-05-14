import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int v1, v2;
        
        v1 = teclado.nextInt();
        v2 = teclado.nextInt();

        if (v1 > v2) {
            System.out.println("o valor " + v1 + " é maior do que o valor " + v2);
        } else {
            System.out.println("o valor " + v2 + " é maior do que o valor " + v1);
        }

        teclado.close();

    }

}
