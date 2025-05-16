import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int h1, h2, hv, hn, m1, m2, mv, mn;

        h1 = teclado.nextInt();
        h2 = teclado.nextInt();
        m1 = teclado.nextInt();
        m2 = teclado.nextInt();

        if (h1 > h2) {
            hv = h1;
            hn = h2;
        } else {
            hv = h2;
            hn = h1;
        } 

        if (m1 > m2) {
            mv = m1;
            mn = m2;
        } else {
            mv = m2;
            mn = m1;
        }

        int soma = hv + mn;
        int produto = hn * mv;

        System.out.println("soma: " + soma);
        System.out.println("produto: " + produto);

        teclado.close();

    }

}
