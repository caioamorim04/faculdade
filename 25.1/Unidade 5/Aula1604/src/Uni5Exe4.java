public class Uni5Exe4 {
    public static void main(String[] args) {
        int s = 0;

        for (int i = 1; i <= 20; i++) {
            double n = ((2 * i) + 1);
            double d = (n * (n + 1));
            s += n / d; 

            System.out.println("valor de s " + s);

        }


    }

}
