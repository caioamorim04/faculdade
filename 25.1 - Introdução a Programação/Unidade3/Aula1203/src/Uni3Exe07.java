import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int lata, garrafa, pet;
        double l350, g600, g2l;
        double qtdl350, qtdg600, qtdg2l;
        double totalLitros;

        lata = teclado.nextInt();
        garrafa = teclado.nextInt();
        pet = teclado.nextInt();

        l350 = 0.35;
        g600 = 0.60;
        g2l = 2.00;

        qtdl350 = (lata * l350);
        qtdg600 = (garrafa * g600);
        qtdg2l = (pet * g2l);

        totalLitros = (qtdg2l + qtdg600 + qtdl350);

        System.out.println("o cliente comprou ao total " + totalLitros + " litros.");

        teclado.close();

    }

}
