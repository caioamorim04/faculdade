public class Uni5Exe10 {
    public static void main(String[] args) {
        
        int contador = 0;
        
        for (int numero = 1; numero <= 9999; numero++) {
            if (contador == 10 ) {

            }
            
            if (numero >= 10) {
                double parte1 = (numero / 100);
                double parte2 = (numero % 100);
                double soma = (parte1 + parte2);

                if (soma * soma == numero) {
                    System.out.println("numero " + numero);
                    contador++;
                }
            }   

        }

    }

}
