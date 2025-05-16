import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float n1, n2, n3, exe, media;
        String conceito = "";
        String situação = "";

        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        n3 = teclado.nextFloat();
        exe = teclado.nextFloat();

        media = ((n1 + (n2 * 2) + (n3 * 3) + exe) / 7);

        if (media >= 9.0) {
            conceito = "A";
            situação = "Aprovado";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
            situação = "Aprovado";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
            situação = "Aprovado";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
            situação = "Reprovado";
        } else {
            conceito = "E";
            situação = "Reprovado";
        }

        System.out.println("A média de aproveitamento foi: " + media + ". Conceito: " + conceito + ". " + situação);

        teclado.close();

    }

}
