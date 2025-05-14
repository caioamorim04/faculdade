import java.util.Scanner;

public class Uni3Exe14Uri {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double V = teclado.nextDouble();
        int N = (int) V;
        int M = (int) ((V - N) * 100);

        int N100 = N / 100;
        N -= N100 * 100;
        int N50 = N / 50;
        N -= N50 * 50;
        int N20 = N / 20;
        N -= N20 * 20;
        int N10 = N / 10;
        N -= N10 * 10;
        int N5 = N / 5;
        N -= N5 * 5;
        int N2 = N / 2;
        N -= N2 * 2;
        int M1 = N;
        N -= M1 * 1;
        int M50 = M / 50;
        M -= M50 * 50;
        int M25 = M / 25;
        M -= M25 * 25;
        int M10 = M / 10;
        M -= M10 * 10;
        int M05 = M / 5;
        M -= M05 * 5;
        int M01 = M;
        
        System.out.println("NOTAS:");
        System.out.println(N100 + " nota(s) de R$ 100.00");
        System.out.println(N50 + " nota(s) de R$ 50.00");
        System.out.println(N20 + " nota(s) de R$ 20.00");
        System.out.println(N10 + " nota(s) de R$ 10.00");
        System.out.println(N5 + " nota(s) de R$ 5.00");
        System.out.println(N2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(M1 + " moeda(s) de R$ 1.00");
        System.out.println(M50 + " moeda(s) de R$ 0.50");
        System.out.println(M25 + " moeda(s) de R$ 0.25");
        System.out.println(M10 + " moeda(s) de R$ 0.10");
        System.out.println(M05 + " moeda(s) de R$ 0.05");
        System.out.println(M01 + " moeda(s) de R$ 0.01");

        teclado.close();
    }

}
