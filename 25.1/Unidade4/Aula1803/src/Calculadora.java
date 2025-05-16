import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe o numero 1:");
        int n1 = teclado.nextInt();
        System.out.println("informe o numero 2:");
        int n2 = teclado.nextInt();
        System.out.println("informe o operador:");
        char operador = teclado.next().charAt(0);
        double resultado = 0;

        if (operador == '+') {
            resultado = n1 + n2;
        } else if (operador == '-') {
            resultado = n1 - n2;
        } else if (operador == '*') {
            resultado = n1 * n2;
        } else if (operador == '/') {
            if (n2 != 0 && n1 != 0) {
                resultado = n1 / n2;
            } else {
                System.out.println("divisão por zero");
                teclado.close();
                return;
            }
        } else {
            System.out.println("operador invalido");
            teclado.close();
            return;
        }

        System.out.println("resultado: " + resultado);

        teclado.close();
    }
}
