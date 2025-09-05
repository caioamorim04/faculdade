package exeAva;

public class App {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(0, 0);
        Ponto p2 = new Ponto(4, 3);
        Retangulo r1 = new Retangulo(p1, p2);

        System.out.println("area: " + r1.calcularArea());
        System.out.println("perimetro: " + r1.calcularPerimetro());

        Retangulo r2 = new Retangulo(new Ponto(2, 1), new Ponto(5, 4));
        Retangulo inter = r1.calcularInterseccao(r2);

        System.out.println("area da interseccao: " + inter.calcularArea());
        System.out.println("perimetro da interseccao: " + inter.calcularPerimetro());
    }
}
