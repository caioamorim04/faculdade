public class ExeWhile {
    public static void main(String[] args) {

        /* int numero = 0;
        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
*/
        int numero = 0;
        while (numero <= 100) {
            boolean primo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(numero);
            }

            numero++;
        }

    }

}
