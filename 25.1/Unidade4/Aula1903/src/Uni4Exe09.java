import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2;
        
        System.out.println("digite dois valores inteiros");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println("os numeros sao multiplos ");
        } else {
            System.out.println("os numeros nao sao multiplos");
        }

        teclado.close();
        
    }

}
