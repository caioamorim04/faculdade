package exeAva;

public class Retangulo {
    private Ponto pontoSuperiorEsquerdo;
    private Ponto pontoInferiorDireito;

    public Retangulo(Ponto p1, Ponto p2) {
        this.pontoSuperiorEsquerdo = p1;
        this.pontoInferiorDireito = p2;
    }

    public int calcularArea() {
        int base = Math.abs(pontoInferiorDireito.getX() - pontoSuperiorEsquerdo.getX());
        int altura = Math.abs(pontoInferiorDireito.getY() - pontoSuperiorEsquerdo.getY());
        return base * altura;
    }

    public int calcularPerimetro() {
        int base = Math.abs(pontoInferiorDireito.getX() - pontoSuperiorEsquerdo.getX());
        int altura = Math.abs(pontoInferiorDireito.getY() - pontoSuperiorEsquerdo.getY());
        return 2 * (base + altura);
    }

    public Retangulo calcularInterseccao(Retangulo outro) {
        int x1 = Math.max(this.pontoSuperiorEsquerdo.getX(), outro.pontoSuperiorEsquerdo.getX());
        int y1 = Math.max(this.pontoSuperiorEsquerdo.getY(), outro.pontoSuperiorEsquerdo.getY());
        int x2 = Math.min(this.pontoInferiorDireito.getX(), outro.pontoInferiorDireito.getX());
        int y2 = Math.min(this.pontoInferiorDireito.getY(), outro.pontoInferiorDireito.getY());

        if (x1 >= x2 || y1 >= y2) {
            throw new IllegalArgumentException("retangulos nao se intersectam");
        }

        return new Retangulo(new Ponto(x1, y1), new Ponto(x2, y2));
    }

    public static Retangulo calcularInterseccao(Retangulo r1, Retangulo r2) {
        return r1.calcularInterseccao(r2);
    }
}
