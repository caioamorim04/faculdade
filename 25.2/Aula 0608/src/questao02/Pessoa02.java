package questao02;

public class Pessoa02 {
	public double peso;
	public double altura;
	public String nome;
	
	public double calcularImc() {
		double imc = peso / (altura * altura);
		return imc;
	}

}
