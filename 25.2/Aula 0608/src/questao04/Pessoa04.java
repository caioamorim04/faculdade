package questao04;

public class Pessoa04 {
	public double peso;
	public double altura;
	public String nome;
	
	public double calcularImc() {
		double imc = peso / (altura * altura);
		return imc;
	}

}
