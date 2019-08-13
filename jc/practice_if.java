import java.util.Scanner;

public class practice_if {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        if(user<19){
            if(user>16 && user<18){
                System.out.println("you are 17");
            }
            else{
                System.out.println("16 or younger");
            }
        }
    }
}