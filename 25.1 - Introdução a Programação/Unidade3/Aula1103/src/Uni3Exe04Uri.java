import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe04Uri {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        
        double A;
        double B; 
        double M; 

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        M = ((A*3.5 + B*7.5)) / 11;
        
        System.out.println("MEDIA ="+df.format(M));
    
        teclado.close();

    }

}
