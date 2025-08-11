package questao03;

import java.util.Scanner;

public class App03 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			Pessoa03 p;
			Pessoa03[] pessoas = new Pessoa03 [3];
			
		for (int i = 0; i < 3; i++) {
			p = new Pessoa03();

			System.out.println("informe o peso da pessoa");
			p.nome = teclado.next();
			
			System.out.println("informe o peso da pessoa");
			p.peso = teclado.nextDouble();
			
			System.out.println("informe a altura da pessoa");
			p.altura = teclado.nextDouble();
			
			pessoas[i] = p;
		}
		
			for (int i = 0; i < 3; i++) {
				p = pessoas[i];
				System.out.println("nome: " + p.nome + " Imc: " + p.calcularImc());
			}
			
		teclado.close();
		
		}
	
}
