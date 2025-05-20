import java.util.Scanner;

public class ProvaFinal {
  
  private ProvaFinal() {
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("capacidade maxima da mochila (kg): ");
    int capacidadeMaxima = teclado.nextInt();
    
    System.out.print("tamanho da mochila: ");
    int capacidadeMaximaItens = teclado.nextInt();
    
    String[] mochila = new String[capacidadeMaximaItens];
    int[] pesos = new int[capacidadeMaximaItens];
    int tamanhoAtual = 0;
    
    int opcao;
    do {
      System.out.println("....MENU....");
      System.out.println("1 - inserir item");
      System.out.println("2 - imprimir mochila inversa");
      System.out.println("3 - item mais pesado");
      System.out.println("4 - ordenar mochila por peso");
      System.out.println("5 - excluir item");
      System.out.println("0 - sair");
      System.out.print("escolha a opcao: ");
      opcao = teclado.nextInt();
      
      switch (opcao) {
        case 1:
          tamanhoAtual = inserirItem(teclado, mochila, pesos, capacidadeMaxima, tamanhoAtual, capacidadeMaximaItens);
          break;
        case 2:
          imprimirMochila(mochila, pesos, tamanhoAtual);
          break;
        case 3:
          String maisPesado = itemMaisPesado(mochila, pesos, tamanhoAtual);
          System.out.println("item mais pesado: " + maisPesado);
          break;
        case 4:
          ordenarMochila(mochila, pesos, tamanhoAtual);
          System.out.println("mochila ordenada por peso.");
          break;
        case 5:
          tamanhoAtual = excluirItem(teclado, mochila, pesos, tamanhoAtual);
          break;
        case 0:
          System.out.println("xauuu");
          break;
        default:
          System.out.println("opcao invalida");
      }
    } while (opcao != 0);
    
    teclado.close();
  }
  
  private int inserirItem(Scanner teclado, String[] mochila, int[] pesos, int capacidadeMaxima, int tamanhoAtual, int capacidadeMaximaItens) {
    if (tamanhoAtual == capacidadeMaximaItens) {
      System.out.println("nao tem mais espaço na mochila");
      return tamanhoAtual;
    }
  
    teclado.nextLine(); 
    System.out.print("digite o nome do item: ");
    String value = teclado.nextLine();
  
    System.out.print("digite o peso do item: ");
    int peso = teclado.nextInt();
  
    int pesoAtual = 0;
    for (int i = 0; i < tamanhoAtual; i++) {
      pesoAtual += pesos[i];
    }
  
    if (pesoAtual + peso > capacidadeMaxima) {
      System.out.println("peso da mochila excedido, item nao inserido :(");
      return tamanhoAtual;
    }
  
    mochila[tamanhoAtual] = value;
    pesos[tamanhoAtual] = peso;
    System.out.println("item inserido com sucesso :)");
    return tamanhoAtual + 1;
  }
  
  
  private void imprimirMochila(String[] mochila, int[] pesos, int tamanhoAtual) {
    if (tamanhoAtual == 0) {
      System.out.println("mochila vazia");
      return;
    }
    System.out.println("mochila (do ultimo ao primeiro):");
    for (int i = tamanhoAtual - 1; i >= 0; i--) {
      System.out.println("[" + mochila[i] + "] peso: [" + pesos[i] + "]");
    }
  }
  
  private String itemMaisPesado(String[] mochila, int[] pesos, int tamanhoAtual) {
    if (tamanhoAtual == 0) {
      return "mochila vazia";
    }
    
    int maiorPeso = pesos[0];
    int indiceMaior = 0;
    for (int i = 1; i < tamanhoAtual; i++) {
      if (pesos[i] > maiorPeso) {
        maiorPeso = pesos[i];
        indiceMaior = i;
      }
    }
    return mochila[indiceMaior];
  }
  
  private void ordenarMochila(String[] mochila, int[] pesos, int tamanhoAtual) {
    for (int i = 0; i < tamanhoAtual - 1; i++) {
      for (int j = 0; j < tamanhoAtual - 1 - i; j++) {
        if (pesos[j] > pesos[j + 1]) {
          int tempPeso = pesos[j];
          pesos[j] = pesos[j + 1];
          pesos[j + 1] = tempPeso;
          
          String tempItem = mochila[j];
          mochila[j] = mochila[j + 1];
          mochila[j + 1] = tempItem;
        }
      }
    }
  }
  
  private int excluirItem(Scanner teclado, String[] mochila, int[] pesos, int tamanhoAtual) {
    if (tamanhoAtual == 0) {
      System.out.println("mochila vazia");
      return tamanhoAtual;
    }
    
    System.out.print("digite o nome do item para excluir: ");
    String value = teclado.nextLine();
    teclado.nextLine();
    
    int indice = -1;
    for (int i = 0; i < tamanhoAtual; i++) {
      if (mochila[i].equalsIgnoreCase(value)) {
        indice = i;
        break;
      }
    }
    
    if (indice == -1) {
      System.out.println("item nao existe");
      return tamanhoAtual;
    }
    
    for (int i = indice; i < tamanhoAtual - 1; i++) {
      mochila[i] = mochila[i + 1];
      pesos[i] = pesos[i + 1];
    }
    mochila[tamanhoAtual - 1] = null;
    pesos[tamanhoAtual - 1] = 0;
    
    System.out.println("item excluido com sucesso");
    return tamanhoAtual - 1;
  }
  
  public static void main(String[] args) {
    new ProvaFinal();
  }
}
