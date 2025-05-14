import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int v1, v2, opcao;
        
        System.out.println("valor 1: ");
        v1 = teclado.nextInt();
        System.out.println("valor 2: ");
        v2 = teclado.nextInt();
        System.out.println("escolha uma opção: ");
        System.out.println("opção 1: Soma de dois números");
        System.out.println("opção 2: Diferença entre dois números");
        System.out.println("opção 3: Produto entre dois números");
        System.out.println("opção 4: Divisão entre dois números (o denominador não pode ser zero)");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1: 
                double soma = v1 + v2;
                System.out.println(soma);
                break;

            case 2: 
                double diferenca = v1 - v2;
                System.out.println(diferenca);
                break;

            case 3: 
                double produto = v1 * v2;
                System.out.println(produto);
                break;

            case 4: 
                if (v2 != 0) {
                    double divisao = v1 / v2;
                    System.out.println(divisao);
                } else {
                    System.out.println("o denominador não pode ser zero.");
                }
                break;

            default:
                System.out.println("opção inválida");
                break;
        }

        teclado.close();

    }

}
