import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int L, A;
        int area;

        L = teclado.nextInt();
        A = teclado.nextInt();

        area = (A * L);

        System.out.println(area);

        teclado.close();

    }

}
