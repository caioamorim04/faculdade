import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int valor, centena, dezena, unidade;

        System.out.println("digite um numero inteiro de  ate 3 digitos");
        valor = teclado.nextInt();

        if (valor < 0 || valor > 999) {
            System.out.println("numero fora do intervalo permitido");
        } else {
            centena = (valor / 100);
            dezena = ((valor % 100) / 10);
            unidade = valor % 10;

            System.out.println(centena + " centena(a) " + dezena + " dezenas(a)" + unidade + " unidade(s)");

        }
        
        teclado.close();
            
    }

}
