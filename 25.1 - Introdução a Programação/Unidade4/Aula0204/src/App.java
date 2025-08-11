import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");


        System.out.println("digite o tipo do envio:");
        System.out.println("1 - caixa");
        System.out.println("2 - cilindro");
        int tipoEnvio = teclado.nextInt();
        double peso, valorEnvio = 0;

        switch (tipoEnvio) {
            case 1:
                System.out.println("digite a largura da caixa (cm):");
                double largura = teclado.nextDouble();
                System.out.println("digite a altura da caixa (cm):");
                double altura = teclado.nextDouble();
                System.out.println("digite o comprimento da caixa (cm):");
                double comprimento = teclado.nextDouble();
                System.out.println("digite o peso da caixa (kg):");
                peso = teclado.nextDouble();

                double volumeCaixa = largura * altura * comprimento;
                valorEnvio = calcularFrete(peso, volumeCaixa);
                break;

            case 2:
                System.out.println("digite o raio do cilindro (cm):");
                double raio = teclado.nextDouble();
                System.out.println("digite a altura do cilindro (cm):");
                double alturaCilindro = teclado.nextDouble();
                System.out.println("digite o peso do cilindro (kg):");
                peso = teclado.nextDouble();

                double volumeCilindro = Math.PI * Math.pow(raio, 2) * alturaCilindro;
                valorEnvio = calcularFrete(peso, volumeCilindro);
                break;

            default:
                System.out.println("opção inválida");
                teclado.close();
                return;
        }

        System.out.println("o valor do envio é " + df.format(valorEnvio));
        teclado.close();
    }

    public static double calcularFrete(double peso, double volume) {
        double tarifaBase = 5.0;
        double custoPeso = peso * 2.0;
        double custoVolume = volume * 0.001;
        return tarifaBase + custoPeso + custoVolume;
    }
}
