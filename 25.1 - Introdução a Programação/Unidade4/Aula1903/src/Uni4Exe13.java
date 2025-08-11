import java.util.Scanner;

public class Uni4Exe13 {
    
    public static int contarBoas(int carta1, int carta2, int carta3) {
        int boas = 0;
        
        if (carta1 == 1 || carta2 == 1 || carta3 == 1) {
            boas++;
        }
        if (carta1 == 2 || carta2 == 2 || carta3 == 2) {
            boas++;
        }
        if (carta1 == 3 || carta2 == 3 || carta3 == 3) {
            boas++;
        }
        return boas;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("informe a primeira carta: ");
        int carta1 = teclado.nextInt();
        System.out.print("informe a segunda carta: ");
        int carta2 = teclado.nextInt();
        System.out.print("informe a terceira carta: ");
        int carta3 = teclado.nextInt();
        
        int boas = contarBoas(carta1, carta2, carta3);

        if (boas == 1) {
            System.out.println("TRUCO");
        } else if (boas == 2) {
            System.out.println("SEIS");
        } else if (boas == 3) {
            System.out.println("NOVE");
        } else {
            System.err.println("to pelado");
        }
        
        teclado.close();

    }
}
