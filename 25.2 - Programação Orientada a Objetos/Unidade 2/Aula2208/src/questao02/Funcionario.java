package questao02;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIrpf() {
        double imposto = 0;
        double base = salario;

        if (base > 4664.68) {
            imposto = imposto + (base - 4664.68) * 0.275;
            base = 4664.68;
        }
        if (base > 3751.05) {
            imposto = imposto + (base - 3751.05) * 0.225;
            base = 3751.05;
        }
        if (base > 2826.65) {
            imposto = imposto + (base - 2826.65) * 0.15;
            base = 2826.65;
        }
        if (base > 1903.98) {
            imposto = imposto + (base - 1903.98) * 0.075;
            base = 1903.98;
        }

        return imposto;
    }
}
