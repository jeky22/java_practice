package outerpack;

import java.util.ArrayList;

public class JWEOuterClass {
    public static void main(String[] args) {
        ArrayList<Fruits> mFruitsList = new ArrayList<Fruits>();
        mFruitsList.add(new Fruits("Bad Fruits"));
        mFruitsList.add(new Fruits("Good Fruits"));
        for (Fruits t : mFruitsList) {
            System.out.println("fruit : " + mFruitsList);
        }
    }
}
