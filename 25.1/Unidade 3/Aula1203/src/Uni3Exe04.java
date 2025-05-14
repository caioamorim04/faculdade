import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double n1, n2, n3, media;
        int p1, p2, p3;
        
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        p1 = 5;
        p2 = 3;
        p3 = 2;

        media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);

        System.out.println(media);

        teclado.close();

    }

}
