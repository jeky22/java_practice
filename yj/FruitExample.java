import java.util.*;

public class FruitExample {
    public static void main(String[] args) {
        ArrayList<Fruit> mFruitsList = new ArrayList<Fruit>();
        mFruitsList.add(new Fruit("Good Fruits"));
        mFruitsList.add(new Fruit("Bad Fruits"));
        System.out.println("fruit: " + mFruitsList);
    }
}