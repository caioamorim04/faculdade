import java.util.Scanner;

public class Uni3Exe11Uri {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int D, TM;

        D = teclado.nextInt();
        TM = (D * 2);
        
        System.out.println(TM + " minutos");

        teclado.close();

    }

}
