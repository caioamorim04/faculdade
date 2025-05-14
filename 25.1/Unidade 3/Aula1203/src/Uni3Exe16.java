import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int valorCompra = teclado.nextInt();
        int valorPago = teclado.nextInt();
        int troco = valorPago - valorCompra;
        
        int notas100 = troco / 100;
        troco %= 100;
        int notas10 = troco / 10;
        troco %= 10;
        int notas1 = troco;
        int total = notas100 + notas10 + notas1;
        
        System.out.println("o número minimo de notas é: " + total);
        
        System.out.println("quantidade de notas de 100 necessárias é: " + notas100);
        System.out.println("quantidade de notas de 10 necessárias é: " + notas10);
        System.out.println("quantidade de notas de 1 necessárias é: " + notas1);
        
        teclado.close();

    }
}
