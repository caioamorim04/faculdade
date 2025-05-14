import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni13Exe14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double distancia, tempo, velocidade, combustivel;

        distancia = teclado.nextInt();
        tempo = teclado.nextInt();
        velocidade = (distancia / tempo);
        combustivel = (distancia / 12);

        System.out.println("a velocidade media foide de " + df.format(velocidade) + " km/h e a quantidade de comvustivel usado foi " + df.format(combustivel) + " litros.");

        teclado.close();

    }

}
