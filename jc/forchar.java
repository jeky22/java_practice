public class forchar {
    public static void main(String[] args) {

        int i, j;
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 5; j++) {

                if (i == 0 || i == 6) {
                    System.out.print("~ ");
                } else if (j == 0 || j == 4) {
                    System.out.print("! ");
                } else {
                    System.out.print(i + j * 5 -5+ " ");
                }
            }
            System.out.println("\n");
        }

        System.out.println("-----------------------------");

    }
}