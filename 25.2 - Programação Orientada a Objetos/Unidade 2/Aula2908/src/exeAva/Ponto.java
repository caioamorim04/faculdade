package exeAva;

public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("coordenadas devem ser positivas");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0) throw new IllegalArgumentException("x deve ser positivo");
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < 0) throw new IllegalArgumentException("y deve ser positivo");
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
