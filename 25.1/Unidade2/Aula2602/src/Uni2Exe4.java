
import java.util.Scanner;

public class Uni2Exe4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("Digite a media A");
            double mediaA = teclado.nextDouble();
            System.out.println("Digite a média B");
            double mediaB = teclado.nextDouble();
            double mediafinal = (float) ((mediaA*3.5) + (mediaB*3.5)) / 11;
            System.out.println("A media final é :"+(mediafinal));
        teclado.close();

    }

}
