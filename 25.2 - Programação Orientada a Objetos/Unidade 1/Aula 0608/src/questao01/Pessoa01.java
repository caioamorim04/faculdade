package questao01;

public class Pessoa01 {
	double peso;
	double altura;
	
	public double calcularImc() {
		double imc = peso / (altura * altura);
		return imc;
	}

}
