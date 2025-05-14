
//Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).

import java.util.Scanner;

public class Uni2Exe3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o raio");
            double raio = teclado.nextFloat();
            double pi = 3.1415;      
            double areatotal = pi*(Math.pow(raio, 2));
            System.out.println("Área é: "+(areatotal));
        teclado.close();


    }
}
