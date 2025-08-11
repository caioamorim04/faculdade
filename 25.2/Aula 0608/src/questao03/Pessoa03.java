package questao03;

public class Pessoa03 {
	double peso, altura;
	String nome;
	
	public double calcularImc() {
		double imc = peso / (altura * altura);
		return imc;
	}

}
