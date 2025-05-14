import java.util.Scanner;

public class Uni3Exe12Uri {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int nDigitada = teclado.nextInt();
        int atual = nDigitada;
        int n100 = atual / 100;
        atual -= n100 * 100;
        int n50 = atual / 50;
        atual -= n50 * 50;
        int n20 = atual / 20;
        atual -= n20 * 20;
        int n10 = atual / 10;
        atual -= n10 * 10;
        int n5 = atual / 5;
        atual -= n5 * 5;
        int n2 = atual / 2;
        atual -= n2 * 2;
        int n1 = atual;
        
        System.out.println(nDigitada);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");


        teclado.close();

    }

}
