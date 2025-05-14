
// Leia 2 valores inteiros e imprima sua multiplicação.

import java.util.Scanner;

public class Uni2Exe2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o valor 1");
            float multiplo1 = teclado.nextFloat();
            System.out.println("Digite o valor 2");
            float multiplo2 = teclado.nextFloat();
            float multiplicaçãototal = (multiplo1*multiplo2);
            System.out.println("o resultado é: "+(multiplicaçãototal));
        teclado.close();

    }

}
