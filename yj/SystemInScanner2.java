import java.util.Scanner;
public class SystemInScanner2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Age: ");
        int user = sc.nextInt();

        if(user < 19) {
            if(user > 16 && user < 19) {
                System.out.println("You are 17 or 18");
            } else {
                System.out.println("16 or younger");
            }
        }
    }
}
