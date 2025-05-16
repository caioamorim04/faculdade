import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int id1, id2, id3;

        id1 = teclado.nextInt();
        id2 = teclado.nextInt();
        id3 = teclado.nextInt();

        if (id1 == id2 && id1 == id3) {
            System.out.println("trigêmeos");
        } else if (id1 == id2 || id1 == id3 || id2 == id3) {
            System.out.println("gêmeos");
        } else {
            System.out.println("apenas irmãos");
        }

        teclado.close();
        
    }

}
