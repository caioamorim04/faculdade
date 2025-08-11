public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < 2) {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }
                
                if (j < 2) {
                    System.out.print("|");
                }

            }
            System.out.println("  ");
        }

    }

}
