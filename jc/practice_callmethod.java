public class practice_callmethod {
    static int globalVaule = 20;

    public static void main(String[] args) {
        int localValue = 50;
        System.out.printf("before change " + localValue);
        localValue = change(500);
        System.out.printf("after change " + localValue);
        System.out.printf("global " + globalVaule);
    }

    public static int change(int data) {
        return data + 100;
    }

}