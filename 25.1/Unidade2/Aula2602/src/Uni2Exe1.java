
// Leia 2 valores inteiros e imprima sua soma.

import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o valor 1");
            float soma1 = teclado.nextFloat();
            System.out.println("Digite o valor 2");
            float soma2 = teclado.nextFloat();
            float somatotal = (soma1+soma2);
            System.out.println("o resultado é: "+(somatotal));
        teclado.close();

    }

}
