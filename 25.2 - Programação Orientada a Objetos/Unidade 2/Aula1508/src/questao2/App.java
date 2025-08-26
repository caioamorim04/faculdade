package questao2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        System.out.print("digite o numero da primeira conta: ");
        c1.setNumero(teclado.nextInt());
        teclado.nextLine();

        System.out.print("digite o titular da primeira conta: ");
        c1.setTitular(teclado.nextLine());

        System.out.print("digite o numero da segunda conta: ");
        c2.setNumero(teclado.nextInt());
        teclado.nextLine();

        System.out.print("digite o titular da segunda conta: ");
        c2.setTitular(teclado.nextLine());

        c1.depositar(1000);
        c1.depositar(700);

        c2.depositar(5000);
        c2.sacar(3000);

        c2.transferir(c1, 1800);

        System.out.println("titular: " + c1.getTitular() + " saldo: " + c1.getSaldo());
        System.out.println("titular: " + c2.getTitular() + " saldo: " + c2.getSaldo());

        teclado.close();
    }
}
