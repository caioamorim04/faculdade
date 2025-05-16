
/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato
 horas:minutos:segundos*/

import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tempo (em segundos): ");
        int tempo = teclado.nextInt();

        int horas = (tempo / 3600);
        int minutos = ((tempo % 3600) / 60);
        int segundos = ((tempo % 3600) % 60);

        System.out.println("h:" + horas + "m:" + minutos + "s:" + segundos);

        teclado.close();

    }

}
