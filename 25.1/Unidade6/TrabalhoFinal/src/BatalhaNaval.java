import java.util.Scanner;
import java.util.Random;

public class BatalhaNaval {

    public static void main(String[] args) {
        jogar();
    }

    private static void jogar() {
    Scanner teclado = new Scanner(System.in);
    Random random = new Random();

    char[][] tabuleiro = new char[8][8];
    tabuleiro(tabuleiro);
    tabuleiro = colocarNavios(tabuleiro, random);

    int tentativas = 0;
    int naviosRestantes = 10;
    int maxTentativas = 30;

    while (tentativas < maxTentativas && naviosRestantes > 0) {
        mostrarTabuleiro(tabuleiro);

        System.out.println("tentativas: " + tentativas + " / " + maxTentativas);
        System.out.println("navios restantes: " + naviosRestantes);
        System.out.println("digite a posicao para atacar (linha e coluna separadas por espaço):");

        int linha = teclado.nextInt();
        int coluna = teclado.nextInt();

        if (!validarPosicao(linha, coluna)) {
            System.out.println("posicao inválida! tente novamente");
            continue;
        }

        if (tabuleiro[linha][coluna] == 'A' || tabuleiro[linha][coluna] == 'X') {
            System.out.println("posição já atacada... tente outra");
            continue;
        }

        tentativas++;

        if (tabuleiro[linha][coluna] == 'N') {
            System.out.println("navio encontrado!");
            tabuleiro[linha][coluna] = 'A';
            naviosRestantes--;
        } else {
            System.out.println("posicão errada... tente novamente");
            tabuleiro[linha][coluna] = 'X';
        }
    }

    tabuleiroFinal(tabuleiro);

    if (naviosRestantes == 0) {
        System.out.println("parabéns! Você venceu!");
    } else {
        System.out.println("fim de jogo, você perdeu!");
    }

    teclado.close();
}


    private static void tabuleiro(char[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = '~';
            }
        }
    }

    private static char[][] colocarNavios(char[][] tab, Random random) {
        int naviosColocados = 0;
        while (naviosColocados < 10) {
            int linha = random.nextInt(8);
            int coluna = random.nextInt(8);
            if (tab[linha][coluna] != 'N') {
                tab[linha][coluna] = 'N'; 
                naviosColocados++;
            }
        }
        return tab;
    }

    private static boolean validarPosicao(int l, int c) {
        return l >= 0 && l < 8 && c >= 0 && c < 8;
    }

    private static void mostrarTabuleiro(char[][] tab) {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tab[i].length; j++) {
                char c = tab[i][j];
                if (c == 'N') { 
                    System.out.print("~ "); 
                } else {
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
    }

    private static void tabuleiroFinal(char[][] tab) {
        System.out.println("tabuleiro final (N = navio, A = acerto, X = erro):");
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
