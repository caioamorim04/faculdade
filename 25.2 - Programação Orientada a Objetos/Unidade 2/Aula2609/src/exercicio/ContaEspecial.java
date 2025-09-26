package exercicio;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String cliente, int numConta, double saldo, double limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
            getMovimentos().add(new Movimento("debito", valor));
        } else {
            throw new IllegalArgumentException("saldo e limite insuficiente");
        }
    }
}
