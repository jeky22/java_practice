import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        // Set set = hmap.entrySet();
        // Iterator iterator = set.iterator();

        // while(iterator.hasNext()) {
        //     Map.Entry entry = (Map.Entry)iterator.next();
        //     System.out.println("Key: " + entry.getKey() + "&Value: " + entry.getValue());
        // }

        // for(Entry<Integer, String> entry : hmap.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + "&Value: " + entry.getValue());
        // }

        for(Integer key : hmap.keySet()) {
            System.out.println("Key: " + key + "&Value: " + hmap.get(key));
        }
    }
}