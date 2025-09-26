package exercicio;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;
    private List<Movimento> movimentos = new ArrayList<>();

    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Movimento> getMovimentos() {
        return movimentos;
    }

    public void depositar(double valor) {
        saldo += valor;
        movimentos.add(new Movimento("credito", valor));
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            movimentos.add(new Movimento("debito", valor));
        } else {
            throw new IllegalArgumentException("saldo insuficiente");
        }
    }
}
