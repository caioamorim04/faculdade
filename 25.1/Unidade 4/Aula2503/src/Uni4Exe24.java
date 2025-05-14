import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor1, valor2, valor3, opcao, temp;

        System.out.println("valor 1: ");
        valor1 = teclado.nextInt();
        System.out.println("valor 2: ");
        valor2 = teclado.nextInt();
        System.out.println("valor 3: ");
        valor3 = teclado.nextInt();
        System.out.println("escolha uma opção:");
        System.out.println("opção 1: Ordem crescente");
        System.out.println("opção 2: Ordem decrescente");
        System.out.println("opção 3: Maior valor no meio");
        opcao = teclado.nextInt();


        switch (opcao) {
            case 1: 
                if (valor1 > valor2) {
                    temp = valor1;
                    valor1 = valor2;
                    valor2 = temp;
                }
                if (valor1 > valor3) {
                    temp = valor1;
                    valor1 = valor3;
                    valor3 = temp;
                }
                if (valor2 > valor3) {
                    temp = valor2;
                    valor2 = valor3;
                    valor3 = temp;
                }
                System.out.println(valor1 + " " + valor2 + " " + valor3);
                break;

            case 2: 
                if (valor1 < valor2) {
                    temp = valor1;
                    valor1 = valor2;
                    valor2 = temp;
                }
                if (valor1 < valor3) {
                    temp = valor1;
                    valor1 = valor3;
                    valor3 = temp;
                }
                if (valor2 < valor3) {
                    temp = valor2;
                    valor2 = valor3;
                    valor3 = temp;
                }
                System.out.println(valor1 + " " + valor2 + " " + valor3);
                break;

            case 3:
                if (valor1 > valor2) {
                    temp = valor1;
                    valor1 = valor2;
                    valor2 = temp;
                }
                if (valor1 > valor3) {
                    temp = valor1;
                    valor1 = valor3;
                    valor3 = temp;
                }
                if (valor2 > valor3) {
                    temp = valor2;
                    valor2 = valor3;
                    valor3 = temp;
                }
                System.out.println(valor2 + " " + valor1 + " " + valor3);
                break;

            default:
                System.out.println("opção inválida");
                break;
        }


        teclado.close();
    }

}
