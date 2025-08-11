import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("hora chegada: ");
        int horaChegada = scanner.nextInt();
        System.out.print("minuto chegada: ");
        int minChegada = scanner.nextInt();
        System.out.print("hora saida: ");
        int horaSaida = scanner.nextInt();
        System.out.print("minutos saida: ");
        int minSaida = scanner.nextInt();

        int totalMinutosChegada = ((horaChegada * 60) + minChegada);
        int totalMinutosSaida = ((horaSaida * 60) + minSaida);
        int tempoTotalMinutos = totalMinutosSaida - totalMinutosChegada;

        int horasCobradas = (tempoTotalMinutos % 60 <= 29) ? (tempoTotalMinutos / 60) : (tempoTotalMinutos / 60) + 1;
        if (horasCobradas == 0)
            horasCobradas = 1;

        if (horaChegada < 0 || horaChegada > 23 || minChegada < 0 || minChegada > 59 ||
                horaSaida < 0 || horaSaida > 23 || minSaida < 0 || minSaida > 59 ||
                (horaSaida < horaChegada) || (horaSaida == horaChegada && minSaida < minChegada)) {
            System.out.println("horarios incorretos");
        }

        int preco = 0;
        switch (horasCobradas) {
            case 1:
            case 2:
                preco = (horasCobradas * 5);
                break;
            case 3:
            case 4:
                preco = 2 * 5 + ((horasCobradas - 2) * 7);
                break;
            default:
                preco = 2 * 5 + 2 * 7 + ((horasCobradas - 4) * 10);
        }

        System.out.println("preço cobrado = R$" + preco + ",00");

        scanner.close();
    }
}
