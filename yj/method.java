public class method {
    int add(int a, int b) {
        int plus = a + b;
        return plus;
    }

    int sub(int a, int b) {
        int minus = a - b;
        return minus;
    }

    int mul(int a, int b) {
        int x = a * b;
        return x;
    }

    int div(int a, int b) {
        int div1 = a / b;
        return div1;
    }

    void print(int a, int b) {
        System.out.println("Enter: " + a + " " + b);
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + sub(a, b));
        System.out.println("Multiplication: " + mul(a, b));
        System.out.println("Division: " + div(a, b));
    }

    public static void main(String args[]) {
        method met = new method();
        met.print(2, 2);
    }
}