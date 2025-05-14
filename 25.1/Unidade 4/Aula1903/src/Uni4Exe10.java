import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int marquinhos, zezinho, luluzinha;

        marquinhos = teclado.nextInt();
        zezinho = teclado.nextInt();
        luluzinha = teclado.nextInt();

        if (marquinhos > zezinho && luluzinha > zezinho ) {
            System.out.println("zezinho é o caçula");
        } else if (zezinho > marquinhos && luluzinha > marquinhos) {
            System.out.println("marquinhos é o caçula");
        } else if (marquinhos > luluzinha && zezinho > luluzinha) {
            System.out.println("luluzinha é a caçula");
        } else if (marquinhos == zezinho && marquinhos == luluzinha) {
            System.out.println("todos tem a mesma idade");
        }

        teclado.close();
    
    }

}
