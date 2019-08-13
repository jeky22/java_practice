public class fornumber_yj {
    public static void main(String args[]) {
        int i, j;
        int n = 1;

        for(i=1; i<6; i++) {
            for(j=0; j<5; j++) {
                System.out.print(n + "\t");
                n += 5;
            }
            n = i + 1;
            System.out.println();
        }
    }
}