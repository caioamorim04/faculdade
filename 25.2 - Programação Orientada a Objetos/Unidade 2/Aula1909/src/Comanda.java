import java.util.ArrayList;

public class Comanda {
    private ArrayList<ItemComanda> itens;

    public Comanda() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String produto, int quantidade, double valorUnitario) {
        ItemComanda item = new ItemComanda(produto, quantidade, valorUnitario);
        itens.add(item);
    }

    public void listarItens() {
        System.out.println("itens da comanda:");
        for (ItemComanda item : itens) {
            System.out.println(item.getQuantidade() + "x " + item.getProduto() 
                               + " - R$ " + item.getValorUnitario() 
                               + " cada (total: R$ " + item.getValorTotal() + ")");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemComanda item : itens) {
            total += item.getValorTotal();
        }
        return total;
    }
}
