import java.util.Scanner;

public class Uni3Exe13Uri {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int T = teclado.nextInt();

        int H = (T / 3600);
        int M = ((T % 3600) / 60);
        int S = ((T % 3600) % 60);

        System.out.println(H + ":" + M + ":" + S);

        teclado.close();
        
    }

}
