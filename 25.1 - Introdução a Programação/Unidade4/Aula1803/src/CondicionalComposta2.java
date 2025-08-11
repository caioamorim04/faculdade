import java.util.Scanner;

public class CondicionalComposta2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade = teclado.nextInt();
        
        if ((idade >= 18) && (idade < 60)) { // && = E
            System.out.println("pagante");
        } else {
            System.out.println("não pagante");
        }
        
        teclado.close();

    }

}
