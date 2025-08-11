
/*Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D).*/

import java.util.Scanner;

public class Uni2Exe5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite o valor A");
        int A = teclado.nextInt();
        
        System.out.println("digite o valor B");
        int B = teclado.nextInt();

        System.out.println("digite o valor C");
        int C = teclado.nextInt();

        System.out.println("digite o valor D");
        int D = teclado.nextInt();

        int diferença = (A * B - C * D);

        System.out.println("a diferença é: "+(diferença));
        teclado.close();

    }

}
