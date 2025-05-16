import java.util.Scanner;

public class Exe3Prova {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tipo da tinta (A, V ou P): ");
        String tipo = teclado.nextLine();
        tipo = tipo.toUpperCase();

        if (tipo.equals("A")) {
            System.out.println("Azul");
        } else {
            if (tipo.equals("V")) {
                System.out.println("Vermelho");
            } else {
                if (tipo.equals("P")) {
                    System.out.println("Preta");
                } else {
                    System.out.println("Tipo incorreto");
                }
            }
        }

        teclado.close();
    }
}
