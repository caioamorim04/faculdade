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
                    // pesquisarValor(vetor, teclado);
                    break;
                case 3:
                    alterarValor(vetor, posicao, teclado);
                    break;
                case 4:
                    posicao = excluirValor(vetor, posicao, teclado);
                    break;
                case 5:
                    mostrarValores(vetor, posicao, teclado);
                    break;
                case 6:
                    ordenarValores(vetor, posicao);
                    break;
                case 7:
                    inverterValores(vetor, posicao);
                    break;
                case 8:
                    break;
                default:
                    break;
            }
        } while (opcao != 8);
    }

    private void inverterValores(int[] vetor, int posicao) {
        for (int i = 0; i < posicao / 2; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[posicao - 1 - i];
            vetor[posicao - 1 - i] = aux;
        }
        System.out.println("Valores invertidos.");
    }

    private void ordenarValores(int[] vetor, int posicao) {
        for (int i = 0; i < posicao - 1; i++) {
            for (int j = i + 1; j < posicao; j++) {
                if (vetor[i] > vetor[j]) {
                    int value = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = value;
                }
            }
        }
        System.out.println("Valores ordenados.");
    }

    private void mostrarValores(int[] vetor, int posicao, Scanner teclado) {
        System.out.print("Valores no vetor: ");
        for (int i = 0; i < posicao; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    private int excluirValor(int[] vetor, int posicao, Scanner teclado) {
        System.out.print("Digite o número que deseja excluir: ");
        int excluir = teclado.nextInt();
        for (int i = 0; i < posicao; i++) {
            if (vetor[i] == excluir) {
                for (int j = i; j < posicao - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                System.out.println("Valor excluído.");
                return posicao - 1;
            }
        }
        System.out.println("Valor não encontrado.");
        return posicao;
    }

    private void alterarValor(int[] vetor, int posicao, Scanner teclado) {
        System.out.print("Digite o número que deseja alterar: ");
        int valorAlterar = teclado.nextInt();
        int indice = pesquisarValor(vetor, valorAlterar);
        if (indice != -1) {
            System.out.println("Digite o novo valor para alterar: ");
            int novoNumero = teclado.nextInt();
            vetor[indice] = novoNumero;
            System.out.println("Valor alterado para " + novoNumero + " na posição vet[" + indice + "]");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    private int pesquisarValor(int[] vetor, int valorAlterar) {
                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] == valorAlterar) {
                        System.out.println("Valor " + valorAlterar + " encontrado na posição vet[" + i + "]");
                return i;
            }
        }
        System.out.println("Número não encontrado.");
        return -1;
    }

    private int incluirValor(int[] vetor, int posicao, Scanner teclado) {
        System.out.print("Digite um número: ");
        int value = teclado.nextInt();
        if (posicao < vetor.length) {
            vetor[posicao] = value;
            System.out.println("Número " + value + " incluído na posição vet[" + posicao + "]");
        } else {
            System.out.println("Posição inválida.");
        }
        return posicao + 1;
    }

    public static void main(String[] args) {
        new Uni6Exe10B();
    }
}
