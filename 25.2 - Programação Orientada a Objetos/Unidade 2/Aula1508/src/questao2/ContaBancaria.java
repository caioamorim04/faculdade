package questao2;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            destino.saldo = destino.saldo + valor;
        }
    }
}
