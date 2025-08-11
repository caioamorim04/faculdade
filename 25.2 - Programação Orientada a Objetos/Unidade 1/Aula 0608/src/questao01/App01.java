package questao01;

public class App01 {

	public static void main(String[] args) {
		Pessoa01 pessoa = new Pessoa01();
		
		pessoa.altura = 1.75;
		pessoa.peso = 78;
		double imc = pessoa.calcularImc();
		
		System.out.println("o imc é " + imc);
		
	}

}
