import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("opção T: calcular a área de um triângulo de base b e altura h");
        System.out.println("opção H: calcular a área de um quadrado de lado l");
        System.out.println("opção R: calcular a área de um retângulo de base b e altura h");
        System.out.println("opção C: calcular a área de um círculo de raio r");
        char opcao = teclado.next().toUpperCase().charAt(0);
        double area = 0;

        switch (opcao) {
            case 'T':
                System.out.print("Base: ");
                double baseT = teclado.nextDouble();
                System.out.print("Altura: ");
                double alturaT = teclado.nextDouble();
                area = (baseT * alturaT) / 2;
                break;
            case 'Q':
                System.out.print("Lado: ");
                double ladoQ = teclado.nextDouble();
                area = ladoQ * ladoQ;
                break;
            case 'R':
                System.out.print("Base: ");
                double baseR = teclado.nextDouble();
                System.out.print("Altura: ");
                double alturaR = teclado.nextDouble();
                area = baseR * alturaR;
                break;
            case 'C':
                System.out.print("Raio: ");
                double raio = teclado.nextDouble();
                area = Math.PI * Math.pow(raio, 2);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("área: " + df.format(area));

        teclado.close();

    }

}
