
/*Considere que você tenha um papel quadrado e o dobre varias vezes sempre em um número par de dobra no meio do quadrado. Ao abrir
 a folha de papel é possível verificar a marcação de novos quadrados. Baseado nisso leia o número de dobras (lembre que sempre é um número 
 par) feitas no papel e escreva quantos quadrados podem ser vistos após desdobrá-lo. */

import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int dobras = teclado.nextInt();

        int quadrados = (int) Math.pow(2, dobras);

        System.out.println("quantide de quadrados" + quadrados);

        teclado.close();

    }

}
