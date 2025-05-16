
/*Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante
 de 90 Km/h. Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um 
 quilômetro a cada 2 minutos. Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro. */

import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int km, mn;

        System.out.println("digite a distância (em km)");
        km = teclado.nextInt();
        mn = ((60 * km) / 30);

        System.out.println("o carro Y vai demorar " + mn + " minutos para percorrer " + km + " a frente do carro X");

        teclado.close();
        
    }

}
