import java.util.HashMap;

public class practice_overloading {
    public static void main(String[] args) {
        printResult(2, 2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static void printResult(int a, int b) {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        hmap.put("add", add(a, b));
        hmap.put("sub", sub(a, b));
        hmap.put("mul", mul(a, b));
        hmap.put("div", div(a, b));

        System.out.println("===Use hashmap===");

        for (String key : hmap.keySet()) {
            System.out.println(key + " : " + hmap.get(key));
        }
        System.out.println("===Use each method call===");

        System.out.println("add : " + add(a, b));
        System.out.println("sub : " + sub(a, b));
        System.out.println("mul : " + mul(a, b));
        System.out.println("div : " + div(a, b));

    }
}