public class Uni5Exe11 {
    public static void main(String[] args) {
        
        int totalBiscoito = 0;

        for (int hora = 1; hora <= 16; hora++) {
            int biscoitos = (int) Math.pow(3, (hora - 1));
            totalBiscoito = totalBiscoito + biscoitos;
        }

        System.out.println("biscoitos quebrados em 16 horas: " + totalBiscoito);
        
    }

}
