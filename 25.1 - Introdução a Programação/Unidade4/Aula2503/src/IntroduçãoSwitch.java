import java.util.Scanner;

public class IntroduçãoSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;

            default:
                System.out.println("outro numero");
        }

        teclado.close();

    }

}
