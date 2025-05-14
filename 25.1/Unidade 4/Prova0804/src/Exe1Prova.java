import java.util.Scanner;

public class Exe1Prova {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float peso, altura;

        peso = teclado.nextFloat();
        altura = teclado.nextFloat();

        if ((altura <= 1.00) && (peso <= 50)) {
            System.out.println("Subnutrido");
            System.out.println("Perigo de vida");
        } else if (altura > 5.00) {
            System.out.println("Pegar medidas novamente");
        } else {
            System.out.println("Erro peso");
        }

        System.out.println("fim");

        teclado.close();

    }

}
