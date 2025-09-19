public class ItemComanda {
    private String produto;
    private int quantidade;
    private double valorUnitario;

    public ItemComanda(String produto, int quantidade, double valorUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public double getValorTotal() {
        return quantidade * valorUnitario;
    }
}
