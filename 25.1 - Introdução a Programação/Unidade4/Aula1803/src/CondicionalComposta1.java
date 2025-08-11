import java.util.Scanner;

public class CondicionalComposta1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade = teclado.nextInt();

        if ((idade < 18) || (idade >= 60)) { // || = OU
            System.out.println("meia entrada");
        } else {
            System.out.println("entrada inteira");
        }
        System.out.println("..FIM..");

        teclado.close();

    }

}
