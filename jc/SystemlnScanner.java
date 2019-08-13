import java.io.IOException;
import java.util.Scanner;

public class SystemlnScanner{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nEnter the first character");
        int ch1 = sc.nextInt();
        System.out.println("After conversion " + ch1);
    }
}