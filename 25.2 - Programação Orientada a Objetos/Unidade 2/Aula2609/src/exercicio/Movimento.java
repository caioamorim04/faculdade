package exercicio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movimento {
    private String tipo;
    private double valor;
    private LocalDate data;
    private LocalTime hora;

    public Movimento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
    }

    @Override
    public String toString() {
        return tipo + " " + valor + " em " + data + " " + hora;
    }
}
