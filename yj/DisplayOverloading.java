public class DisplayOverloading {
    public static void display(String c) {
        System.out.println("One parameter: " + c);
    }

    public void display(String c, int num) {
        System.out.println("Two parameter Method: " + c + ", " + num);
    }

    public void display(int c) {
        System.out.println("One parameter: " + c);
    }

    public static void  main(String[] args) {
        DisplayOverloading d =  new DisplayOverloading();
        d.display("parameter1");
        d.display("parameter2", 654);
    }
}