import java.util.Scanner;
public class SystemInScanner {
    public static void main(String args[]) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Enter the first character: ");
        int ch1 = sc.nextInt();
        System.out.printf("After conversion: " + ch1);
        // 타입변환 필요
    }
}