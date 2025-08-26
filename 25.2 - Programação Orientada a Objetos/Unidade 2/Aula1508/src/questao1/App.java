package questao1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        System.out.print("digite o nome da primeira pessoa: ");
        p1.setNome(teclado.nextLine());

        System.out.print("digite a idade da primeira pessoa: ");
        p1.setIdade(teclado.nextInt());
        teclado.nextLine();

        System.out.print("digite o nome da segunda pessoa: ");
        p2.setNome(teclado.nextLine());

        System.out.print("digite a idade da segunda pessoa: ");
        p2.setIdade(teclado.nextInt());

        if (p1.getIdade() > p2.getIdade()) {
            System.out.println(p1.getNome() + " eh mais velha");
        } else if (p2.getIdade() > p1.getIdade()) {
            System.out.println(p2.getNome() + " eh mais velha");
        } else {
            System.out.println("as duas tem a mesma idade");
        }

        teclado.close();
    }
}
