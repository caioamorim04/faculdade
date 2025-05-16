import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int horasTrabalhadas, horasSemanais, semanas, horasNormais, horasExtras;
        double valorHora, salario, valorHoraExtra;

        horasTrabalhadas = teclado.nextInt();
        valorHora = teclado.nextInt();

        horasSemanais = 40;
        semanas = 4;
        horasNormais = (horasSemanais * semanas);

        if (horasTrabalhadas > horasNormais) {
            horasExtras = horasTrabalhadas - horasNormais;
            valorHoraExtra = (valorHora * 1.5);
            salario = ((horasNormais * valorHora) + (horasExtras * valorHoraExtra)); 
        } else {
            salario = (horasTrabalhadas * valorHora);
        }

        System.out.println("o salario total é: " + df.format(salario));

        teclado.close();
        
    }
}
