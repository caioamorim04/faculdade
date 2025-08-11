/* Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159).
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B. */

import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor A");
        double A = teclado.nextDouble();

        System.out.println("Digite o valor B");
        double B = teclado.nextDouble();

        System.out.println("Digite o valor c");
        double C = teclado.nextDouble();

        double triangulo = (A * C / 2.0);
        double circulo = 3.14159 * (C * C);
        double trapezio = ((A + B) * C) / 2;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("a) %.3f%n", triangulo);
        System.out.printf("b) %.3f%n", circulo);
        System.out.printf("c) %.3f%n", trapezio);
        System.out.printf("d) %.3f%n", quadrado);
        System.out.printf("e) %.3f%n", retangulo);

        teclado.close();

    }

}
