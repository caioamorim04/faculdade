import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite um ponto flutuante maior que 0");
        double valor = teclado.nextDouble();

        if (valor <= 0) {
            System.out.println("valor menor que zero");
        } else if (valor % 1 != 0) { // aqui o operador "%" verifica se há um resto ao dividir o número por 1.
            System.out.println("o numero possui casas decimais");
        } else {
            System.out.println("o numero não possui casas decimais");
        }

        teclado.close();

    }

}

/* Exemplo de uso do %:
* Para o número 28.5: 28.5 % 1 resulta em 0.5 (o número tem casas decimais).
* Para o número 42: 42 % 1 resulta em 0 (o número é inteiro, sem casas decimais). */
