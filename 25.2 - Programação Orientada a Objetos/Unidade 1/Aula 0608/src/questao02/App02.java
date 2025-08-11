package questao02;

import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double altura, peso;
		
		
		System.out.println("informe o peso da pessoa");
		peso = teclado.nextDouble();
		
		System.out.println("informe a altura da pessoa");
		altura = teclado.nextDouble();
		
		Pessoa02 p = new Pessoa02();
		
		p.peso = peso;
		p.altura = altura;
		
		double imc = p.calcularImc();
		
		System.out.println("o imc da pessoa é: " + imc);
		teclado.close();

	}

}
