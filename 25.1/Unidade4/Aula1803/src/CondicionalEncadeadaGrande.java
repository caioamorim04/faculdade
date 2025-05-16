import java.util.Scanner;

public class CondicionalEncadeadaGrande {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("adulto");
        } else {
            if (idade >= 6) {
                System.out.println("adolescente");
            } else {
                System.out.println("infantil");
            }
        }

        teclado.close();

    }

}
