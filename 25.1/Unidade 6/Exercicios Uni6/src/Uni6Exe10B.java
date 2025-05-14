import java.util.Scanner;

public class Uni6Exe10B {
    private Uni6Exe10B() {
        int opcao = 0;
        int posicao = 0;
        int vetor[] = new int[50];
        Scanner teclado = new Scanner(System.in);
        System.out.println("__MENU__");
        do {
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    posicao = incluirValor(vetor, posicao, teclado);

                    break;
                case 2:
                    pesquisarValor(vetor, teclado);
                    break;
                case 3:
                    alterarValor(vetor, posicao, teclado);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;

                default:
                    break;
            }
        } while (opcao != 8);

    }

    private void alterarValor(int[] vetor, int posicao, Scanner teclado) {
       int indice = pesquisarValor(vetor, teclado);
       if (indice >= 0) {
        System.out.println("digite um novo numero ");
        int novoNumero = teclado.nextInt();
        vetor[indice] = novoNumero;
        System.out.println("numero " + novoNumero + "adicionado no vet[" + indice + "]" );
       }
    }

    private int pesquisarValor(int[] vetor, Scanner teclado) {
        System.out.print("digite o numero que deseja pesquisar: ");
        int value = teclado.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == value) {
                System.out.println("valor " + value + " encontrado na posição vet[" + i + "]");
                return i;    
            }
            
        }
        System.out.println("numero nao encontrado");
        return -1;
    }

    private int incluirValor(int[] vetor, int posicao, Scanner teclado) {
        System.out.print("digite um numero: ");
        int value = teclado.nextInt();
        if (posicao < vetor.length) {
            vetor[posicao] = value;
            System.out.println("numero " + value + " incluido na posicao vet[" + posicao + "]");
        } else {
            System.out.println("posição invalida");
        }
        return posicao + 1;
    }

    public static void main(String[] args) {
        new Uni6Exe10B();
    }

}
