import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("a caneta é azul?");
        boolean resposta;

        if (teclado.hasNextBoolean()) { // um método da classe Scanner que verifica se o próximo valor na entrada do usuário pode ser interpretado como um boolean
            resposta = teclado.nextBoolean();
        } else {
            System.out.println("entrada invalida, digite 'true' ou 'false'");
            teclado.close();
            return;
        }

        if (resposta) {
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

        teclado.close();

    }

}
