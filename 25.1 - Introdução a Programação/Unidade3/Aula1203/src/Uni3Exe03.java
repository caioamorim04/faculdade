import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        double valorLitro, valorPagamento, qtdLitros;

        valorPagamento = teclado.nextDouble();
        valorLitro = teclado.nextDouble();
        qtdLitros = (valorPagamento / valorLitro);

        System.out.println("o motorista conseguiu colocar: " + df.format(qtdLitros) + " litros");   

        teclado.close();
        
    }

}
