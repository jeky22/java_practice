import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class practice_collection {
    public static void main(String[] args) {

        //선언부
        ArrayList<String> list = new ArrayList<String>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        list.add("Item4");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(49);
        list2.add(900);
        list2.add(123);
        list2.add(23);
        
        //hmap.put(key,value)
        HashMap<String, List> hmap = new HashMap();
        hmap.put("str", list);
        hmap.put("integer", list2);

        //hmap.get(key)-> retrun value;
        ArrayList<Integer> outlist01 = new ArrayList<Integer>();
        ArrayList<String> outlist02 = new ArrayList<String>();
        outlist01 = (ArrayList<Integer>) hmap.get("integer");
        outlist02 = (ArrayList<String>) hmap.get("str");

        //list 출력
        for(int result : outlist01)
        {
            System.out.println(result);
        }
        System.out.println();
        for(String result : outlist02)
        {
            System.out.println(result);
        }
   
    }
}