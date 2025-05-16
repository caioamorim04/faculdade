
/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
 mostrando 4 casas decimais após a vírgula, segundo a fórmula: */

import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double x1, x2, y1, y2;

        System.out.println("Digite o ponto x1");
        x1 = teclado.nextDouble();

        System.out.println("Digite o ponto x2");
        x2 = teclado.nextDouble();

        System.out.println("Digite o ponto y1");
        y1 = teclado.nextDouble();

        System.out.println("Digite o ponto y2");
        y2 = teclado.nextDouble();

        double distância = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2);

        System.out.printf("Distancia: %.4f%n" , distância);

        teclado.close();

    }

}
