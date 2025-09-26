package exercicio;

public class App {
    public static void main(String[] args) {
        // Questão 1 e 2 - testes simples
        ContaEspecial c1 = new ContaEspecial("joao", 1, 20, 100);
        c1.sacar(50);
        System.out.println("esperado: -30 | obtido: " + c1.getSaldo());

        ContaEspecial c2 = new ContaEspecial("maria", 2, 20, 100);
        c2.sacar(120);
        System.out.println("esperado: -100 | obtido: " + c2.getSaldo());

        ContaEspecial c3 = new ContaEspecial("ana", 3, 20, 100);
        try {
            c3.sacar(120.01);
        } catch (IllegalArgumentException e) {
            System.out.println("excecao lançada corretamente");
        }

        // Questão 3 e 4 - histórico
        ContaEspecial ce = new ContaEspecial("pedro", 4, 0, 500);
        ce.depositar(1000);
        ce.sacar(250);

        System.out.println("historico de movimentos:");
        for (Movimento m : ce.getMovimentos()) {
            System.out.println(m);
        }
    }
}
