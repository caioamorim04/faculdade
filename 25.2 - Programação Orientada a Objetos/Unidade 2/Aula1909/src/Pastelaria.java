public class Pastelaria {
    public static void main(String[] args) {
        Comanda comanda = new Comanda();

        comanda.adicionarItem("pastel de carne", 2, 7.50);
        comanda.adicionarItem("coca-cola lata", 1, 6.00);
        comanda.adicionarItem("caldo de cana", 3, 5.00);

        comanda.listarItens();

        double total = comanda.calcularTotal();
        System.out.println("valor total a pagar: R$ " + total);
    }
}
