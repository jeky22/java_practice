import java.util.ArrayList;

public class practice_innerclass {
    public static void main(String[] args) {
        ArrayList<Fruits> mFruitsList = new ArrayList<Fruits>();
        mFruitsList.add(new Fruits("Good Fruits"));
        mFruitsList.add(new Fruits("Bad Fruits"));
        System.out.printf("fruit : " + mFruitsList);
    }
}

class Fruits {
    private String caption;

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return this.caption;
    }

    public Fruits(String caption) {
        this.caption = caption;
    }

    public String toString() {
        return caption;
    }
}