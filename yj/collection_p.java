import java.util.*;

public class collection_p {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Melon");

        int[] mango = {39, 20, 30, 12, 40};
        int[] apple = {48, 20, 10, 32};
        int[] banana = {99, 23, 123};
        int[] melon = {49, 22, 45, 12};

        ArrayList<Integer[]> list = new ArrayList<Integer[]>();
        // list.add(mango);
        // list.add(apple);
        // list.add(banana);
        // list.add(melon);

        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("fruit", fruit);
        map.put("integer", list);

        ArrayList<String> outlist01 = new ArrayList<String>();
        outlist01 = (ArrayList<String>)map.get("fruit");

        ArrayList<Integer> outlist02 = new ArrayList<Integer>();
        outlist02 = (ArrayList<Integer>)map.get("integer");

        for(String i : outlist01) {
            for(Integer j : outlist02) {
                System.out.println(i + ": " + j);
            }
        }

        // ArrayList<String> aList = new ArrayList<String>(Arrays.asList(mango));
        // aList.addAll(Arrays.asList(apple));
    }
}