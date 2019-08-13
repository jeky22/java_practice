public class callbyvalue {
    static int globalValue = 20;
    public static void main(String args[]) {
        SystemInScanner systemInScanner = new SystemInScanner();
        int localValue = 50;
        System.out.println("Before change: " + localValue);
        // localValue = change(500);
        localValue = systemInScanner.change(500);
        System.out.println("After change: " + localValue);
        System.out.println("Global: " + globalValue);
    }

    public int change(int data) {
        int returnValue;
        returnValue = data + 100;
        return returnValue;
    }
}