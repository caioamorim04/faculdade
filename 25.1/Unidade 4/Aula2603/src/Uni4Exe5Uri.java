import java.util.Scanner;

public class Uni4Exe5Uri {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horaInicial = teclado.nextInt();
        int horaFinal = teclado.nextInt();
        
        int duracao;
        
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        teclado.close();

    }
}
