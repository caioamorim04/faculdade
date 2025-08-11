import java.util.Scanner;

public class CondicionalEncadeada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }

        teclado.close();
        
    }

}
