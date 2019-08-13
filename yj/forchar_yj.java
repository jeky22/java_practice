public class forchar_yj {
    public static void main(String args[]) {
        int i, j;
        int n = 1;

        for(i=0; i<7; i++) {
            for(j=0; j<5; j++) {
                if(i==0 || i==6) {
                    System.out.print("~" + "\t");
                } else if(j==0 || j==4) {
                    System.out.print("!" + "\t");
                } else {
                    System.out.print(n + "\t");
                    n += 5;
                }
            }
            n = i + 1;
            System.out.println();
        }
    }
}