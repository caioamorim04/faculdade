import java.util.Scanner;

public class Uni3Exe05Uri {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;
        int DF;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        DF = (A * B - C * D);

        System.out.println("DIFERENCA = " + DF);
        
        teclado.close();
    }

}
